package learn.Tsymbaliuk.javacore.Comparator.sample2;

import learn.Tsymbaliuk.javacore.Comparator.sample1.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        CatAgeComparator compAge = new CatAgeComparator();
        CatNameComparator compName = new CatNameComparator();

        Arrays.sort(cats, compName);
//        Arrays.sort(cats, ((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())));
//        Arrays.sort(cats, Comparator.comparingInt(Cat::getAge));

//        Arrays.sort(cats, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
//        Arrays.sort(cats, Comparator.comparing(Cat::getName));

        System.out.println();
        for (Cat cat : cats) {
            System.out.println(cat);
        }
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

class CatNameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}