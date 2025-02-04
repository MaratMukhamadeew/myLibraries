package learn.Tsymbaliuk.javacore.Functional.sample12;

import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        ToIntFunction<String> fun1 = String::hashCode;
        ToIntFunction<String> fun2 = String::length;

        System.out.println(fun1.applyAsInt("Hello"));
        System.out.println(fun2.applyAsInt("Hello"));
    }
}
