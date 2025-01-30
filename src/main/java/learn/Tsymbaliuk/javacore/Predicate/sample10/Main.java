package learn.Tsymbaliuk.javacore.Predicate.sample10;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPred1 = (str, n) -> str.length() < n + 3;
        BiPredicate<String, Integer> biPred2 = (str, n) -> str.length() > n - 3;

        String text = "Hello";

        System.out.println(biPred1.and(biPred2).test(text, 3));
    }
}
