package learn.Tsymbaliuk.anonymousClass.sample5;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] words = { "Hello", "Cat", "Home", "Student" };
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };

        System.out.println(comparator.getClass().getName());
        Arrays.sort(words, comparator);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
    }
}
