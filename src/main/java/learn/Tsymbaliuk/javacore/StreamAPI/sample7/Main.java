package learn.Tsymbaliuk.javacore.StreamAPI.sample7;

import learn.Tsymbaliuk.javacore.StreamAPI.sample2.Cat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat(null, 7, "Black");
        Cat cat3 = new Cat("Barsik", 3, "Yellow");
        Cat cat4 = new Cat("Luska", 2, "Grey");

        List<Cat> list = List.of(cat1, cat2, cat3, cat4);

        Stream<Cat> catToName = list.stream().filter(cat -> cat.getWeight() > 5).filter(cat -> cat.getName().length() > 5);

        try {
            List<Cat> result = catToName.collect(Collectors.toList());
        } catch (NullPointerException e) {
            System.err.println(e);
        }
    }
}
