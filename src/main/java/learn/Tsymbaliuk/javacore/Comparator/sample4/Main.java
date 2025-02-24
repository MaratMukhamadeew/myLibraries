package learn.Tsymbaliuk.javacore.Comparator.sample4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] array = { 5, 0, -3, 2, -1, 4 };

        Comparator<Integer> comp = (a, b) -> Math.abs(a) - Math.abs(b);
//        Comparator<Integer> comp = Comparator.comparingInt(Math::abs);

        Arrays.sort(array, comp.reversed());
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, comp);
        System.out.println(Arrays.toString(array));
    }
}
