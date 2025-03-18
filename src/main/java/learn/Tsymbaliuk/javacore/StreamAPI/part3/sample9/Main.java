package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample9;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("A", n -> n + n);

        stream.limit(5).forEach(System.out::println);
    }
}
