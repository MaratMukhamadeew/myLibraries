package learn.Tsymbaliuk.javacore.privateMethos.sample2;

import java.util.Comparator;

public class CatNameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {

        return Integer.compare(o1.getName().compareTo(o2.getName()), 0);

//        if (o1.getName().compareTo(o2.getName()) > 0) {
//            return 1;
//        }
//        if (o1.getName().compareTo(o2.getName()) < 0) {
//            return -1;
//        }
//        return 0;
    }
}
