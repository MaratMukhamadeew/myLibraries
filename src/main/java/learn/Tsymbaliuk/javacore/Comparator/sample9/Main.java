package learn.Tsymbaliuk.javacore.Comparator.sample9;

import learn.Tsymbaliuk.javacore.Comparator.sample1.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Bob", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        cats.add(null);

        Comparator<Cat> compAge = Comparator.comparingInt(Cat::getAge);
        Comparator<Cat> resComp = Comparator.nullsLast(compAge);

//        Comparator<Cat> compAge = Comparator.nullsLast(Comparator.comparingInt(Cat::getAge));


        Cat minAgeCat = Collections.min(cats, resComp);

        System.out.println(minAgeCat);
    }
}
