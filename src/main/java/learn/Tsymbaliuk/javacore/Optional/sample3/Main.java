package learn.Tsymbaliuk.javacore.Optional.sample3;

import learn.Tsymbaliuk.javacore.Optional.sample1.Cat;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Cat cat2 = new Cat("Barsic", "White");
        Cat cat3 = new Cat("Umka", "Gray");

        Cat[] cats = new Cat[] { cat1, cat2, cat3 };

        Optional<Cat> result = findCatByNameOptional("Vaskaa", cats);

        String catColor1 = result.map(a -> a.getColor()).get();
        String catColor2 = result.map(Cat::getColor).get();

        System.out.println(catColor1);
        System.out.println(catColor2);
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
