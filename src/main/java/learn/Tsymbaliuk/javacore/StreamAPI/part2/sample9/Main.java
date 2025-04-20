package learn.Tsymbaliuk.javacore.StreamAPI.part2.sample9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);

        list.stream()
                .takeWhile(n -> n >= 0)
                .forEach(System.out::println);
    }
}
