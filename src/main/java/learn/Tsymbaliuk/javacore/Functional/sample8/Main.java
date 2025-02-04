package learn.Tsymbaliuk.javacore.Functional.sample8;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> fun = Function.identity();
        System.out.println(fun.apply(100));
    }
}
