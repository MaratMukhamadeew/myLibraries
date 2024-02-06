package learn.JavaGuru.hashMap;

import java.util.*;

public class DuplicatesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(30);

        Map<Integer, Integer> duplicatesMap = new HashMap<>();
        System.out.println(Arrays.toString(array));

        for (int i : array) {
            if (duplicatesMap.containsKey(i)) {
                int duplicatesCount = duplicatesMap.get(i);
                duplicatesMap.put(i, ++duplicatesCount);
            } else {
                duplicatesMap.put(i, 1);
            }
        }


        for (Map.Entry<Integer, Integer> item : duplicatesMap.entrySet()) {
            System.out.println("Число - " + item.getKey() + " встречается в карте " + item.getValue() + " раз");
        }
    }
}
