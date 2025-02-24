package learn.Tsymbaliuk.javacore.Consumer.sample8;

import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        IntConsumer cons = a -> {
            if (a % 2 == 0) {
                System.out.println(a + " even number");
            } else {
                System.out.println(a + " odd number");
            }
        };

        cons.accept(6);
    }
}
