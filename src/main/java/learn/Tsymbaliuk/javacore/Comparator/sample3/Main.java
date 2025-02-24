package learn.Tsymbaliuk.javacore.Comparator.sample3;

import learn.Tsymbaliuk.javacore.Comparator.sample1.Cat;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

        Comparator<Cat> comp1 = (a, b) -> a.getAge() - b.getAge();
        Comparator<Cat> comp1a = Comparator.comparingInt(Cat::getAge);

        Comparator<Cat> comp2 = Main::catAgeCompare;
        Comparator<Cat> comp3 = Main::catNameCompare;
    }

    public static int catAgeCompare(Cat a, Cat b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    public static int catNameCompare(Cat a, Cat b) {
        return a.getName().compareTo(b.getName());
    }
}
