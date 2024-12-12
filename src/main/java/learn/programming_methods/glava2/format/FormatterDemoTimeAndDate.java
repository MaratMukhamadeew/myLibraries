package learn.programming_methods.glava2.format;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemoTimeAndDate {
    static Formatter formatter;

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //Вывод в 12-часовом временном формате
        print("%tr", calendar);

        // Полноформатный вывод времени и даты
        print("%tc", calendar);

        // Вывод текущего часа и минуты
        print("%tl:%tM", calendar, calendar);

        // Всевозможный вывод месяца
        print("%tB %tb %tm", calendar, calendar, calendar);
        FormatterDemoTimeAndDate.print("%tc", Calendar.getInstance());
    }

    private static void print(String str, Object... args) {
        formatter = new Formatter();
        formatter.format(str,args);
        System.out.println(formatter);
    }
}
