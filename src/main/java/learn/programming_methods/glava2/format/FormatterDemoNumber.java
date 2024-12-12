package learn.programming_methods.glava2.format;

import java.util.Formatter;

public class FormatterDemoNumber {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Hex: %x, Octal: %o", 100, 100);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%a", 100.001);
        System.out.println(formatter);

        formatter = new Formatter();
        for (double i = 1000; i < 10.e+10; i *= 100) {
            formatter.format("%g",i);
            System.out.println(formatter);
        }
    }
}
