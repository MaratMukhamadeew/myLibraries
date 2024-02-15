package learn.BryusEkkel.util;

public class Range {
    public static int[] range(int i) {
        int[] result = new int[i];
        for (int j = 0; j < i; j++) {
            result[j] = j;
        }
        return result;
    }

    public static int[] range(int begin, int end) {
        int length = end - begin;
        int[] result = new int[length];
        for (int i = 0, j = begin; i < length; i++, j++) {
            result[i] = j;
        }
        return result;
    }

    public static int[] range(int begin, int end, int step) {
        int length = (end - begin) / step;
        int[] result = new int[length];
        for (int i = 0, j = begin; i < length; i++, j += step) {
            result[i] = j;
        }
        return result;
    }
}
