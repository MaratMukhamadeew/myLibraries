package learn.Tsymbaliuk.javacore.privateMethos.sample2;

import java.util.Comparator;

public interface NullFriendlyComparator {
    int NOT_NULL = 11;
    static <T>Comparator<T> rangeNullFirst(Comparator<T> unsafeComparator) {
        class NullSafeComparator implements Comparator<T> {
            @Override
            public int compare(T o1, T o2) {
                int result = nullSafeCompare(o1, o2);
                if (result != NOT_NULL) {
                    return result;
                }
                return unsafeComparator.compare(o1, o2);
            }
        }
        return new NullSafeComparator();
    }

    private static <T> int nullSafeCompare(T first, T second) {
        if (first != null & second == null) {
            return 1;
        }
        if (first == null & second != null) {
            return -1;
        }
        if (first == null & second == null) {
            return 0;
        }
        return NOT_NULL;
    }
}
