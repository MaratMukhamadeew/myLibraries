package practice.different;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println(printYear(year));
    }

    public static String printYear(int year) {
        if (tellMeWhatYear(year)) return  "Год " + year + " високосный";
        else return  "Год " + year + " невисокосный";
    }

    public static boolean tellMeWhatYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else isLeap = true;
        }

        return isLeap;
    }
}
