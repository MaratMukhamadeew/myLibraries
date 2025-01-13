package learn.Tsymbaliuk.javacore.anonymousClass.sample2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] words = { "Hello", "Cat", "Home", "Student" };
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(words, comparator);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(words));
    }
}
