package learn.Tsymbaliuk.javacore.Predicate.sample7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna"));

        Predicate<String> pr1 = Predicate.isEqual("Anna");

        names.removeIf(pr1);

        System.out.println(names);
    }
}
