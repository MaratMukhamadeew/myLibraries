package learn.Tsymbaliuk.javacore.Predicate.sample12;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        int[] array = { -4, 1, 6, -3, 0, 1, 7 };

        int even = countElement(array, n -> n % 2 == 0);
        int odd = countElement(array, n -> n % 2 != 0);

        System.out.println(Arrays.toString(array));
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
    public static int countElement(int[] array, IntPredicate pr) {
        int count = 0;
        for (int j : array) {
            if (pr.test(j)) {
                count += 1;
            }
        }
        return count;
    }
}
