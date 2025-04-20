package learn.Tsymbaliuk.algoritms.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

        int[] sequence = new int[] { -2, 0, 3, 5, 7, 9, 11, 15, 18, 21 };
        int element = 5;

        System.out.println(linearSearch(sequence, element));
    }

    public static int linearSearch(int[] sequence, int element) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
