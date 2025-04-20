package learn.Tsymbaliuk.javacore.StreamAPI.part2.sample6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 5, -2, 0, 3, 1, 1, -4, 7);

        list.stream()
                .filter(n -> n >= 0)
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
