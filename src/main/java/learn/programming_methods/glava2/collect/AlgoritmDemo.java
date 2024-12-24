package learn.programming_methods.glava2.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgoritmDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        print(list);
        Collections.sort(list, comparator);
        print(list);
        Collections.reverse(list);
        print(list);
        Collections.rotate(list, 3);
        print(list);
        System.out.println("min: " + Collections.min(list));
        System.out.println("max: " + Collections.max(list));

        List<Integer> singl = Collections.singletonList(71);
        print(singl);
        singl.add(21); // Ошибка времени выполнения
    }

    private static void print(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
