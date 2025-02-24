package learn.Tsymbaliuk.javacore.Comparator.sample11;

import learn.Tsymbaliuk.javacore.Comparator.sample1.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Bob", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        Function<Cat, String> func = Cat::getName;

        Comparator<String> compStr = String::compareTo;

        Comparator<Cat> resultComp = Comparator.comparing(func, compStr);

        Cat minAgeCat = Collections.min(cats, resultComp);

        System.out.println(minAgeCat);
    }
}
