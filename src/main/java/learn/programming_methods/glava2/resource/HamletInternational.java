package learn.programming_methods.glava2.resource;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HamletInternational {
    public static void main(String[] args) {
        char ch = 0;
        System.out.println("1 - английский \n2 - белорусский \nлюбой - русский ");
        try {
            ch = (char) System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (ch) {
            case '1' -> {
                country = "US";
                language = "en";
            }
            case '2' -> {
                country = "BY";
                language = "be";
            }
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("property/text", current);
        String str1 = rb.getString("str1");
        System.out.println(str1);

        String str2 = rb.getString("str2");
        System.out.println(str2);
    }
}

