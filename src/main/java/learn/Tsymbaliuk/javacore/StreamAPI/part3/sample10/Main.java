package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");

        List<String> list = stream.collect(Collectors.toList());

        System.out.println(list);
    }
}
