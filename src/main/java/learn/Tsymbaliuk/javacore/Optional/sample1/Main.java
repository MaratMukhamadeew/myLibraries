package learn.Tsymbaliuk.javacore.Optional.sample1;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Gray");

        Cat[] cats = new Cat[] { cat1, cat2, cat3 };

        Optional<Cat> result = findCatByNameOptional("Vaskaa", cats);

//        result.get();

        if (result.isPresent()){
            Cat cat = result.get();
            System.out.println(cat);
        } else {
            System.out.println("Cat not found");
        }

        Cat findCat = findCatByName("Vaska", cats);
        if (findCat != null) {
            System.out.println(findCat);
        }

        try {
            Cat findCatEx = findCatByNameEx("Vaskaa", cats);
            System.out.println(findCatEx);
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
    }
    public static Cat findCatByName(String name, Cat[] cats) {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;
    }
    public static Cat findCatByNameEx(String name, Cat[] cats) throws NoSuchElementException {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        throw new NoSuchElementException();
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
