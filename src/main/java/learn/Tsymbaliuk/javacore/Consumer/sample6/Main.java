package learn.Tsymbaliuk.javacore.Consumer.sample6;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biCons = (a, b) -> System.out.println(a.repeat(b));

        biCons.accept("Hello ", 3);
    }
}
