package learn.programming_methods.glava2.format;

import java.util.Formatter;

public class FormatterDemoFlags {
    static Formatter formatter;

    public static void main(String[] args) {
        // Выравнивание вправо
        print("|%10.2f|", 123.123);

        // Выравнивание влево и применение флага '-'
        print("|%-10.2f", 123.123);

        // Применение флага '' и '('
        print("% (d", -100);

        // Применение флага ','
        print("%,.2f", 123456789.34);

        // Задание точности представления чисел
        print("%.4f", 1111.1111111);

        // Задание точности представления для строк
        print("%.16s", "Now I know class java.util.Formatter");
    }
    private static void print(String str, Object... args) {
        formatter = new Formatter();
        formatter.format(str, args);
        System.out.println(formatter);
    }
}
