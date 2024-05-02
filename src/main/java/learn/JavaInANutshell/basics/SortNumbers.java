package learn.JavaInANutshell.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Этот класс демонстрирует сортировку чисел при помощи простого алгоритма
 */
public class SortNumbers {
    /**
     * Это очень простой алгоритм сортировки, не очень эффективный при сортировке больших наборов элементов
     */
    public static void sort(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) min = j;
            }
            swap(numbers, i, min);
        }
    }

    public static void main(String[] args) throws IOException {
        double[] numbers = new double[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 100;
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для отображения соседних с ним в массиве большего и меньшего числа");
        int number = Integer.parseInt(in.readLine());
        sort(numbers);
        for (double d : numbers) {
            System.out.println(d);
        }
        System.out.println();
        printNumbers(numbers, number);
    }

    private static void swap(double[] numbers, int i, int min) {
        double temp;
        temp = numbers[i];
        numbers[i] = numbers[min];
        numbers[min] = temp;
    }

    private static void printNumbers(double[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (number < numbers[0]) {
                System.out.println("Введенное число -> " + number + "\nМеньше него в массиве нет" +
                        "\nСоседнее большее -> " + numbers[0]);
                break;
            }
            if (number < numbers[i]) {
                System.out.println("Введенное число -> " + number + "\nСоседнее меньшее -> " + numbers[i - 1] +
                        "\nСоседнее большее -> " + numbers[i]);
                break;
            } if (number > numbers[numbers.length - 1]){
                System.out.println("Введенное число -> " + number + "\nСоседнее меньшее -> " + numbers[numbers.length - 1] +
                        "\nБольше него в массиве нет");
                break;
            }
        }
    }
}
