package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[] { "Java", "Python", "Fortran", "C"};

        IntStream stream = Arrays.stream(array).flatMapToInt(String::codePoints);

        stream.forEach(System.out::println);
    }
}
