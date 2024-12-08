package learn.java_coding_problems_Anghel_Leonard.chapter1.counting_duplicate_characters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("Marat"));
        System.out.println(countDuplicateCharactersStream("Marat"));
    }
    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateCharactersStream(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
