package learn.Tsymbaliuk.anonymousClass.sample6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] words = { "Hello", "Cat", "Home", "Student" };
        Comparator<String> comparator1 = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator<String> comparator2 = null;
        try {
            comparator2 = comparator1.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(comparator1 == comparator2);
        Arrays.sort(words, comparator1);
        System.out.println(Arrays.toString(words));
        shuffleArray(words);
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, comparator2);
        System.out.println(Arrays.toString(words));
    }
    static void shuffleArray(String[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
