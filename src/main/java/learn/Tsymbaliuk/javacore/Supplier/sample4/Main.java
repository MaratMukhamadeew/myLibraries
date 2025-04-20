package learn.Tsymbaliuk.javacore.Supplier.sample4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] { "Luke", "Darth", "Obi-Wan", "R2D2" };

        String firstLetter = "J";

        Optional<String> name = Optional.ofNullable(findNameByFirstLetter(names, firstLetter));

        String result = name.orElseGet(() -> "Name not found. May the force be with you.");

        System.out.println(result);
    }

    public static String findNameByFirstLetter(String[] names, String firstLetter) {
        for (String name : names) {
            if (name.startsWith(firstLetter)) {
                return name;
            }
        }
        return null;
    }
}
