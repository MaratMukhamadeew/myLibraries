package learn.Tsymbaliuk.javacore.Optional.sample2;

import learn.Tsymbaliuk.javacore.Optional.sample1.Cat;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Gray");

        Cat[] cats = new Cat[] { cat1, cat2, cat3 };

        Cat defaultCat = new Cat("Default name", "Default color");
        Optional<Cat> result = findCatByNameOptional("Vaskaa", cats);

        Cat cat = result.orElse(defaultCat);
        System.out.println(cat);

        Cat getCat = result.orElseGet(Cat::new);
        System.out.println(getCat);

        Cat catEx = result.orElseThrow(NoSuchElementException::new);
        System.out.println(catEx);
        Cat catRes = result.orElseThrow();
        System.out.println(catRes);

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
