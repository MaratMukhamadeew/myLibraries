package learn.programming_methods.glava2.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DemoDateFormat {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date date = null;
        String str = "April 9, 2012";
        try {
            date = df.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            System.err.println("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(date));

        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            df = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "--->" + df.format(date));
        }
    }
}
