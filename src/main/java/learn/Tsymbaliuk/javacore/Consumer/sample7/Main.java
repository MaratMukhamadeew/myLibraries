package learn.Tsymbaliuk.javacore.Consumer.sample7;

import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 5, " five");

        BiConsumer<Integer, String> biCons = (a, b) -> System.out.println((b + " ").repeat(a));

        map.forEach(biCons);
    }
}
