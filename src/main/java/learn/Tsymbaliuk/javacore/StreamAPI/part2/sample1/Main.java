package learn.Tsymbaliuk.javacore.StreamAPI.part2.sample1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 5, -2, 1, -4, 7);

        List<Integer> resultList = list.stream().filter(a -> a > 0).collect(Collectors.toList());

        System.out.println(resultList);
    }
}
