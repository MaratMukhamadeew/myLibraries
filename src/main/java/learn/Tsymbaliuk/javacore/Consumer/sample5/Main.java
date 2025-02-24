package learn.Tsymbaliuk.javacore.Consumer.sample5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> cons1 = s -> System.out.print("*" + s);

        Consumer<String> cons2 = s -> System.out.println("*");

        Consumer<String> result = cons1.andThen(cons2);

        result.accept("Hello");
    }
}
