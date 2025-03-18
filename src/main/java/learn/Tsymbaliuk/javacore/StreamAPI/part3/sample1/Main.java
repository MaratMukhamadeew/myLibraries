package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample1;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "Fortran", "C");

        Stream<Integer> stream = list.stream().map(String::length);

        stream.forEach(System.out::println);
    }
}
