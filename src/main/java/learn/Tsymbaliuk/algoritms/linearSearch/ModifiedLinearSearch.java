package learn.Tsymbaliuk.algoritms.linearSearch;

import java.util.ArrayList;
import java.util.List;

public class ModifiedLinearSearch {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int[] s = new int[] { -2, 0, 3, 5, 7, 9, 11, 15, 18, 21 };
        List<Integer> sequence = new ArrayList<>();
        for (int j : s) {
            sequence.add(j);
        }
        int element = 5;

        System.out.println(modifierLinearSearch(sequence, element));

        System.out.println(sequence);
    }

    public static int modifierLinearSearch(List<Integer> sequence, int element) {
        sequence.add(element);
        int lastIndex = sequence.size() - 1;
        int i = 0;
        while (sequence.get(i) != element) {
            i++;
        }
        sequence.remove(lastIndex);
        if (i != lastIndex) {
            return i;
        }
        return -1;
    }
}
