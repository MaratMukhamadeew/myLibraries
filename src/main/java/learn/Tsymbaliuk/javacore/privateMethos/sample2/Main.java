package learn.Tsymbaliuk.javacore.privateMethos.sample2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 5);
        Cat cat2 = new Cat("Umka", 3);
        Cat cat3 = new Cat("Kuzia", 7);
        Cat cat4 = new Cat("Barsic", 2);

        Cat[] cats = { cat1, cat2, null, cat3, cat4 };

//        Comparator<Cat> comp = new CatWeightComparator();
//        comp = NullFriendlyComparator.rangeNullFirst(comp);

//        Comparator<Cat> comp = NullFriendlyComparator.rangeNullFirst(new CatWeightComparator());
//        Comparator<Cat> comp = NullFriendlyComparator.rangeNullFirst(new CatNameComparator());

        Comparator<Cat> comp = NullFriendlyComparator.rangeNullFirst(Comparator.comparingInt(Cat::getWeight));
        Comparator<Cat> compName = NullFriendlyComparator.rangeNullFirst(Comparator.comparing(Cat::getName));


        Arrays.sort(cats, comp);

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();

        Arrays.sort(cats, compName);

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
