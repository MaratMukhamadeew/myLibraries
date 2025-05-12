package practice.different;

import java.util.Scanner;

public class SimpleSumma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нижний предел:");
        double low = scanner.nextDouble();

        System.out.println("Верхний предел:");
        double high = scanner.nextDouble();

        System.out.println("Square: " + calculate(low, high));
    }

    public static double calculate(double low, double high) {
        double step = 0.00000001;
        double square = 0.0;
        double current = low;

        while (current < high) {
            double a = current * current;
            double b = (current + step) * (current + step);
            double st = step * (a + b) / 2.0;
            square += st;
            current += step;
        }
        return square;
    }
}
