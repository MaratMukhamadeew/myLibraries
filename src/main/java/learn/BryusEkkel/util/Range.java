package learn.BryusEkkel.util;

public class Range {
    // Генерирование серии [0..n]
    public static int[] range(int i) {
        int[] result = new int[i];
        for (int j = 0; j < i; j++)
            result[j] = j;
        return result;
    }

    // Генерирование серии [start..end]
    public static int[] range(int start, int end) {
        int length = end - start;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = start + i;
        }
        return result;
    }
// Генерировнаие серии [start..end] с приращенем step
    public static int[] range(int start, int end, int step) {
        int length = (end - start) / step;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }
}
