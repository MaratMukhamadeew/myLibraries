package learn.Tsymbaliuk.javacore.lambdaFunction.sample3;

public class MathUtilite {
    private static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private static Summator summator = () -> getSumma(array);
    public static void setArray(int[] array) {
        MathUtilite.array = array;
    }
    public static Summator getSummator() {
        return summator;
    }
    public static int getSumma(int[] array) {
        int sum = 0;
        for(int element : array) {
            sum += element;
        }
        return sum;
    }
}
