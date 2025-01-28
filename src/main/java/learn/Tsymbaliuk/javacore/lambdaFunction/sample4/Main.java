package learn.Tsymbaliuk.javacore.lambdaFunction.sample4;

public class Main {
    public static void main(String[] args) {
        var summator = getIntegerSummator(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(summator.getSum());
    }

    public static Summator getIntegerSummator(int[] array) {
        return () -> {
            int sum = 0;
            for (int j : array) {
                sum += j;
            }
            return sum;
        };
    }
}
