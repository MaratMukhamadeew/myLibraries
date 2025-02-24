package learn.Tsymbaliuk.javacore.Predicate.sample8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna"));

        Predicate<String> pr1 = new NamePredicate<>("Anna");

        names.removeIf(pr1);
        System.out.println(names);
    }
}

class NamePredicate<T> implements Predicate<T> {
    private final T baseElement;

    public NamePredicate(T baseElement) {
        super();
        this.baseElement = baseElement;
    }

    @Override
    public boolean test(T t) {
        return Objects.equals(t, baseElement);
    }
}