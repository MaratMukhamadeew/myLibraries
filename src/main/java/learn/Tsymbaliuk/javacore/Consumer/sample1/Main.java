package learn.Tsymbaliuk.javacore.Consumer.sample1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> cons1 = new HashCodePrinter<>();
        Consumer<String> cons2 = str -> System.out.println(str.hashCode());

        cons1.accept("Hello");
        cons2.accept("Hello");
    }
}

class HashCodePrinter<T> implements Consumer<T> {
    @Override
    public void accept(T t) {
        System.out.println(t.hashCode());
    }
}
