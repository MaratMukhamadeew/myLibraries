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

        Comparator<Cat> comp = NullFriendlyComparator.rangeNullFirst(new CatWeightComparator());


        Arrays.sort(cats, comp);

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
