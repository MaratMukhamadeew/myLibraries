package JavaGuru.collections;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(i, random.nextInt(50));
        }
        // 1
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                else if (o1 < o2) return -1;
                else return 0;
            }
        });
        // 2
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        // 3
        list.sort((o1, o2) -> o1.compareTo(o2));
        // 4
        list.sort(Integer::compareTo);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }

        list.removeIf(n -> n % 2 != 0);
        System.out.println(list);

        Set<Integer> set = new TreeSet<>(list);

        System.out.println(set);
    }
}
