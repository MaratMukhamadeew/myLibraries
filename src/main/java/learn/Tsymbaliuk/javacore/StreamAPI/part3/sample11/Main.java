package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample11;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.ofNullable("Hello");

        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.ofNullable(null);

        stream2.forEach(System.out::println);
    }
}
