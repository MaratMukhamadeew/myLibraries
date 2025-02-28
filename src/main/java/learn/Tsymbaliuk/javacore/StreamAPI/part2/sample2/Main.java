package learn.Tsymbaliuk.javacore.StreamAPI.part2.sample2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 2, -2, 1, -4, 6);

        List<Integer> resultList = list.stream()
                .filter(n -> n > 0)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
