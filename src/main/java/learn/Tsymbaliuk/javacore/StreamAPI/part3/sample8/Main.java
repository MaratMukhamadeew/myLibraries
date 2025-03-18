package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample8;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n <= 10, n -> n + 1);

        stream.forEach(System.out::println);
    }
}
