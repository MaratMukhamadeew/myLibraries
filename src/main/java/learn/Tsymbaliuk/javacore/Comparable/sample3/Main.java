package learn.Tsymbaliuk.javacore.Comparable.sample3;

import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> func = String::length;

        Comparator<String> cmp = Comparator.comparing(func);

        System.out.println(cmp.compare("Java", "Python"));
    }
}
