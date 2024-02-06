package learn.JavaGuru.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMaxNumbersSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        int maxLength = 0;
        String numbersSeq = "";
        while (matcher.find()) {
            if (maxLength < matcher.end() - matcher.start()) {
                maxLength = matcher.end() - matcher.start();
                numbersSeq = matcher.group();
            }
        }

        System.out.println(maxLength + " " + numbersSeq);
    }
}
