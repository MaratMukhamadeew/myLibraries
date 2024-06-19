package learn.skillboxAlgoritm.chapter1;

import java.util.Arrays;

public class ArrayMax {
    public static int findMaxUnderBoundary(int[] inputArray, int topBoundary) {
        int currentMax = Integer.MIN_VALUE;
        for (int i : inputArray) {
            if (i < topBoundary) {
                currentMax = Math.max(currentMax, i);
            }
        }
        return currentMax;
    }

    public static int[] findTopElement(int[] inputArray, int numberOfElement) {
        int[] topElements = new int[numberOfElement];

        int previousMax = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfElement; i++) {
            previousMax = findMaxUnderBoundary(inputArray, previousMax);
            topElements[i] = previousMax;
        }
        return topElements;
    }

    public static void main(String[] args) {
        int[] array = { 15, 12, 19, 14, 11, 13, 17, 10, 16 };
        System.out.println(Arrays.toString(findTopElement(array, 3)));
    }
}
