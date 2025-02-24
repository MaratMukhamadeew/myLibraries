package learn.Tsymbaliuk.javacore.Predicate.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(-1, 4, 5, 0, -2));

        Predicate<Integer> pr1 = Main::test1;
        Predicate<Integer> pr2 = Main::test2;

        numbers.removeIf(pr1.and(pr2));
        System.out.println(numbers);
    }

    public static boolean test1(Integer n) {
        return n < 0;
    }

    public static boolean test2(Integer n) {
        return n % 2 == 0;
    }
}
