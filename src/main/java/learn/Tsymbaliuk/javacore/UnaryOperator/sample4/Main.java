package learn.Tsymbaliuk.javacore.UnaryOperator.sample4;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> unOp = String::strip;
        Function<String, Integer> func = String::length;
        Function<String, Integer> result = unOp.andThen(func);

        System.out.println(result.apply("  hello  "));
    }
}
