package learn.Tsymbaliuk.javacore.var.sample8;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> func = (@NotZeroLength var a) -> a.length();

        System.out.println(func.apply("Java"));
    }
}
@interface NotZeroLength {}
