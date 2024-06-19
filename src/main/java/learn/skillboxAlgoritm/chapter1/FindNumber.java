package learn.skillboxAlgoritm.chapter1;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {
    public static void main(String[] args) {
        // Блокнотик: 79161002030L, 79255558877L, 79219990000L
        long[] phoneNumbers = new long[] { +79161002030L, +79255558877L, +79219990000L, +79161002030L };

        List<Long> uniqueNumbers = new ArrayList<>();

        for (long currentNumber : phoneNumbers) {
            boolean alreadyExist = false;

            for (Long existingNumber : uniqueNumbers) {
                if (existingNumber == currentNumber) {
                    alreadyExist = true;
                    break;
                }
            }
            if (!alreadyExist) {
                uniqueNumbers.add(currentNumber);
            }
        }

        System.out.println(uniqueNumbers);
    }
}
