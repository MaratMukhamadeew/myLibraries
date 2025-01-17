package learn.Tsymbaliuk.javacore.functionInterface.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "Cat", "Java", "Bag"));

        System.out.println(list);

//        list.removeIf(s -> s.length() > 3);

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 3;
            }
        });

        System.out.println(list);
    }
}
