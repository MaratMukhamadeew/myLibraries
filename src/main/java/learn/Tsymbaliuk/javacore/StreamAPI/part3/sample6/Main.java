package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample6;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.empty();

        stream.forEach(System.out::println);
    }
}
