package learn.Tsymbaliuk.javacore.StreamAPI.part2.sample5;

import learn.Tsymbaliuk.javacore.StreamAPI.part2.sample3.Cat;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Luska", 5, "White");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4 };

        Stream<Cat> catStream = Arrays.stream(cats).distinct();

        catStream.forEach(System.out::println);
    }
}
