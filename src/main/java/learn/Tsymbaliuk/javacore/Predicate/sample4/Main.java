package learn.Tsymbaliuk.javacore.Predicate.sample4;

import learn.Tsymbaliuk.javacore.Predicate.sample1.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsik", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        Predicate<Cat> pr1 = cat -> cat.getAge() < 5;
        Predicate<Cat> pr2 = cat -> cat.getAge() > 10;

        cats.removeIf(pr1.or(pr2));
        System.out.println(cats);
    }
}
