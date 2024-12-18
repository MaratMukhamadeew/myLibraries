package learn.programming_methods.glava2.scan;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDelimiterDemo {
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner scanner = new Scanner("1,3;2,0; 8,5; 4,8;9,0; 1; 10;");
//        scanner.useLocale(Locale.FRANCE);
        scanner.useLocale(Locale.US);
        scanner.useDelimiter(";\\s*");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                System.out.println(scanner.next());
            }
        }
        scanner.close();
        System.out.println("Сумма чисел = " + sum);
    }
}
