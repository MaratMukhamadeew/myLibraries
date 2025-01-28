package learn.Tsymbaliuk.javacore.Optional.sample4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] names = { null, null, " Vaska", null, "Barsik" };

        Optional<String> result = Optional.empty();

        for (String str : names) {
            Optional<String> temp = Optional.ofNullable(str);
            result = result.or(() -> temp);
        }
        System.out.println(result.get());
    }
}
