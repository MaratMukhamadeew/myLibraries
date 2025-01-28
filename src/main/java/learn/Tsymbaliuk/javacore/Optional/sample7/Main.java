package learn.Tsymbaliuk.javacore.Optional.sample7;

import learn.Tsymbaliuk.javacore.Optional.sample1.Cat;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", "Black");
        Optional<Cat> result = Optional.of(cat1);

        Optional<Cat> repCat1 = result.map(Main::repaintCat);

        Optional<Cat> repCat2 = result.flatMap(Main::repaintCatOptional);

        System.out.println(repCat1.get());
        System.out.println(repCat2.get());
    }

    public static Cat repaintCat(Cat cat) {
        return new Cat(cat.getName(), "White");
    }

    public static Optional<Cat> repaintCatOptional(Cat cat) {
//        Cat repaintCat = new Cat(cat.getName(), "Green");
//        return Optional.of(repaintCat);

        return Optional.of(new Cat(cat.getName(), "Green"));
    }
}
