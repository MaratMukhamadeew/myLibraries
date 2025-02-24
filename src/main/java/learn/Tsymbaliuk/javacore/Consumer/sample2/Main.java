package learn.Tsymbaliuk.javacore.Consumer.sample2;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> cons1 = s -> System.out.println("{ " + s + " }");
        Consumer<String> cons2 = Main::simplePrinter;

        cons1.accept("Hello world");
        cons2.accept("Hello world");
    }

    public static <T> void simplePrinter(T operand) {
        System.out.println("{ " + operand + " }");
    }
}
