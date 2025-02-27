package learn.Tsymbaliuk.javacore.StreamAPI.sample2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Umka", 7, "Black");
        Cat cat3 = new Cat("Barsik", 3, "Yellow");
        Cat cat4 = new Cat("Luska", 2, "Grey");

        List<Cat> list = List.of(cat1, cat2, cat3, cat4);

        int weight = 5;

        List<Cat> result = list.stream()
                .filter(cat -> cat.getWeight() >= weight)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
