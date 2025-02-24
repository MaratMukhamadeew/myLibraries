package learn.Tsymbaliuk.javacore.Consumer.sample4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Java", "Fortran", "Python"));

        Consumer<String> cons1 = System.out::println;

        list.forEach(cons1);

        list.forEach(System.out::println);
    }
}
