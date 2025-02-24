package learn.Tsymbaliuk.javacore.Predicate.sample5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(-1, 4, 5, 0, -2));

        Predicate<Integer> pr1 = n -> n > 0;

        numbers.removeIf(pr1.negate());
        System.out.println(numbers);
    }
}
