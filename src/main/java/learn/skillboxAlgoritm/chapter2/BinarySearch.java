package learn.skillboxAlgoritm.chapter2;

public class BinarySearch {
    public static int binarySearch(int[] array, int search) {
        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;;


        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] < search) {
                left = middle + 1;
            } else if (array[middle] > search) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return middle;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 2));
    }
}
