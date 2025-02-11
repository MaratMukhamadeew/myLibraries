package learn.Tsymbaliuk.javacore.Comparator.sample10;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 7, -2, 3, 8);

        Comparator<Integer> comp = Comparator.naturalOrder();

        Integer min = Collections.min(list, comp);

        System.out.println(min);
    }
}
