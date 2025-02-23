package learn.Tsymbaliuk.javacore.Consumer.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String s = "J";

        Consumer<String> cons1 = str -> {
            if (str.startsWith(s)) {
                result.add(str);
            }
        };

        cons1.accept("Java");
        cons1.accept("Julia");
        cons1.accept("Python");

        System.out.println(result);
    }
}
