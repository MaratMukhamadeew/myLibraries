package learn.Tsymbaliuk.javacore.BinaryOperator.sample4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> binOp = (a, b) -> a + b;

        Function<String, Integer> func = String::length;

        BiFunction<String, String, Integer> biFunc = binOp.andThen(func);

        Integer result = biFunc.apply("Hello", "World");
        System.out.println(result);
    }
}
