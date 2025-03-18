package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Umka", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4 };

        List<String> result = Arrays.stream(cats)
                .filter(n -> n.getWeight() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(result);

        Stream<String> stream = Arrays.stream(cats)
                .filter(n -> n.getWeight() > 2)
                .map(Cat::getName);

        stream.forEach(System.out::println);
    }
}
