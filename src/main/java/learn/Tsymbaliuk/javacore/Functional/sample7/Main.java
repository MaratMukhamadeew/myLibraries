package learn.Tsymbaliuk.javacore.Functional.sample7;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> fun1 = str -> str.replaceAll("[^A-Za-z]","");

        Function<String, Integer> fun2 = String::length;

        Function<String, Integer> fun3 = fun2.compose(fun1);

        Function<String, Integer> fun4 = fun1.andThen(fun2);

        String text = "Hello world 1234, 621, a 15";

        System.out.println(fun3.apply(text));
        System.out.println(fun4.apply(text));
    }
}
