package learn.Tsymbaliuk.javacore.Functional.sample2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> fun1 = str -> str.length();
        System.out.println(fun1.apply("Hello"));

        Function<String,Integer> fun2 = String::length;
        System.out.println(fun2.apply("World"));
    }
}
