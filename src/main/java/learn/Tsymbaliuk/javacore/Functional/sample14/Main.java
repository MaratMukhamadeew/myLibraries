package learn.Tsymbaliuk.javacore.Functional.sample14;

import java.util.function.ToIntBiFunction;

public class Main {
    public static void main(String[] args) {
        ToIntBiFunction<Character, Character> fun1 = (a, b) -> a + b;
        ToIntBiFunction<Character, Character> fun2 = Integer::sum;

        System.out.println(fun1.applyAsInt('a','b'));
        System.out.println(fun2.applyAsInt('a','b'));
    }
}
