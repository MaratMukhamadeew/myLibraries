package learn.Tsymbaliuk.javacore.Comparator.sample6;

import learn.Tsymbaliuk.javacore.Comparator.sample1.Cat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Bob", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

        Comparator<Cat> compAge = Comparator.comparingInt(Cat::getAge);
        Function<Cat, String> func = Cat::getName;

        Comparator<Cat> resultComp = compAge.thenComparing(func);

        Arrays.sort(cats, resultComp);

        for(Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
