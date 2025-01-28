package learn.Tsymbaliuk.javacore.Optional.sample5;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] names = { null, null, " Vaska", null, "Barsik" };

        Optional<String> result = Optional.empty();

        for (String str : names) {
//            Optional<String> temp = Optional.ofNullable(str)
//                                            .filter(a -> a.startsWith("B"));
//            result = result.or(() -> temp);

            result = result.or(() -> Optional.ofNullable(str).filter(a -> a.startsWith("B")));
        }
        System.out.println(result.get());
    }
}
