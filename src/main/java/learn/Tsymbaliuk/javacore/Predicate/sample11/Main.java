package learn.Tsymbaliuk.javacore.Predicate.sample11;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate pr1 = n -> n % 2 == 0;
        DoublePredicate pr2 = n -> n < 0.001;
        LongPredicate pr3 = n -> n < 999999999999L;

        System.out.println(pr1.test(100));
        System.out.println(pr2.test(-0.05));
        System.out.println(pr3.test(55555555L));
    }
}
