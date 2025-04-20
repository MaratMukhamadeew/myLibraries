package learn.Tsymbaliuk.javacore.Supplier.Sample2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> sup1 = () -> (int) (Math.random() * 10);

        Supplier<Integer> sup2 = Main::getRandomNumber;

        System.out.println(sup1.get());
        System.out.println(sup2.get());
    }

    public static Integer getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
