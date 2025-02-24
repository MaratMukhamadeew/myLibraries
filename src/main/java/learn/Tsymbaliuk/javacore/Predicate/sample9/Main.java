package learn.Tsymbaliuk.javacore.Predicate.sample9;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPred = (str, n) -> str.length() > n;

        System.out.println(biPred.test("Hello", 3));
    }
}
