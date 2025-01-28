package learn.Tsymbaliuk.javacore.Optional.sample8;

import learn.Tsymbaliuk.javacore.Optional.sample1.Cat;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Gray");

        Cat[] cats = new Cat[] { cat1, cat2, cat3 };

        Optional<Cat> result = findCatByNameOptional("Vaska", cats);

//        result.ifPresent(cat -> System.out.println(cat));
        result.ifPresent(System.out::println);

        result.ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
    }

    public static Optional<Cat> findCatByNameOptional(String name, Cat[] cats) {
        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
                break;
            }
        }
        return Optional.ofNullable(result);
    }
}
