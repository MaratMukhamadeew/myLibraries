package learn.Tsymbaliuk.javacore.Comparator.sample1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

        CatAgeComparator comp = new CatAgeComparator();

        System.out.println(comp.compare(cat1, cat2) == -comp.compare(cat2, cat1));
        System.out.println(comp.compare(cat1, cat2) > 0 && comp.compare(cat2, cat5) > 0 && comp.compare(cat1, cat5) > 0);
        System.out.println(comp.compare(cat2,cat4) == 0 && (comp.compare(cat2, cat1) < 0 && comp.compare(cat4, cat1) < 0));
    }
}
class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;

//        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
