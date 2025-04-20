package learn.Tsymbaliuk.javacore.UnaryOperator.sample5;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> func = String::length;

        UnaryOperator<Integer> unOp = a -> a * 2;

        Function<String,Integer> result = unOp.compose(func);

        System.out.println(result.apply("hello"));
    }
}
