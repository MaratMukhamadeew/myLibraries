package learn.skillboxAlgoritm.chapter2;

import java.util.Arrays;

public class ArrayShift {


    public static int removeDuplicates(int[] array) {
        int length = array.length;

        int i = 0;
        while (i < length) {
            boolean found = false;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                i++;
                continue;
            } else {
                for (int j = i + 1; j < length; j++) {
                    array[j - 1] = array[j];
                }
                length--;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] array = { 15, 23, 20, 5, 15, 20, 15, 20 };
        System.out.println(Arrays.toString(array));
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }
}
