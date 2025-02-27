package learn.Tsymbaliuk.javacore.StreamAPI.sample8;

import learn.Tsymbaliuk.javacore.StreamAPI.sample2.Cat;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Umka", 7, "Black");
        Cat cat3 = new Cat("Barsik", 3, "Yellow");
        Cat cat4 = new Cat("Kuzia", 2, "Grey");

        List<Cat> list = List.of(cat1, cat2, cat3, cat4);

        Stream<Cat> catToName = list.stream()
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> cat.setName("_" + cat.getName()));

        Optional<Cat> res = list.stream()
                        .max(Comparator.comparingInt(a -> a.getName().length()));

        System.out.println(res.get());
        catToName.forEach(System.out::println);
        System.out.println();

        for (Cat cat : list) {
            System.out.println(cat);
        }
    }
}
