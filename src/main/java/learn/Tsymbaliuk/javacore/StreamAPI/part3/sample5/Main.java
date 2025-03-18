package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample5;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(0, 2, 4, 6);
        List<Integer> list2 = List.of(1, 3, 5, 7);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = list2.stream();

        Stream<Integer> concatStream = Stream.concat(stream1, stream2);

        concatStream.forEach(System.out::println);
    }
}
