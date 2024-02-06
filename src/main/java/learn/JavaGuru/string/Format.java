package learn.JavaGuru.string;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        showExampleOne();
        showExampleTwo();
    }

    static void showExampleOne() {
        System.out.println("Введите логин: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(getFormatLogin(scanner.next()));
    }

    static void showExampleTwo() {
        String str1 = "CAT DOG";
        String str2 = "MOUSE";
        System.out.println(replaceSecondWord(str1, str2));
    }

    static String getFormatLogin(String str) {
        return str.trim().toLowerCase();
    }

    static String replaceSecondWord(String str1, String str2) {
        int i = str1.indexOf(" ");
        String secondWord = str1.substring(i + 1);
        if (secondWord.equals(str2)) {
            System.out.println("Замена бессмысленна");
        } else {
            str1 = str1.substring(0, i + 1).concat(str2);
        }
        return str1;
    }
}
