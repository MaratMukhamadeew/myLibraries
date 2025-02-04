package learn.Tsymbaliuk.javacore.Functional.sample2a;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "Java the best!";
        Function<String, Integer> fun = Main::countWhiteSpace;

        System.out.println(applyToStr(text, fun));
    }
    public static Integer applyToStr(String text, Function<String, Integer> fun) {
        return fun.apply(text);
    }

    public static Integer countWhiteSpace(String text) {
        int n = 0;
        char[] s = text.toCharArray();
        for (char c : s) {
            if (c == ' ') {
                n++;
            }
        }
        return n;
    }
}
