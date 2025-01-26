package practice.javaRush.tasks.tasks15__.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String input = bf.readLine();
                if (input.equals("exit")) {
                    break;
                }
                if (input.contains(".")) {
                    print(Double.parseDouble(input));
                } else if (input.matches("[+-]?\\d+")) {
                    int number = Integer.parseInt(input);
                    if (number > 0 && number < 128) {
                        print(Short.parseShort(input));
                    } else {
                        print(Integer.parseInt(input));
                    }
                } else {
                    print(input);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
