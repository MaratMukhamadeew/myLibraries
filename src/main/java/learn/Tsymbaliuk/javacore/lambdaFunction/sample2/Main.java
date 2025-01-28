package learn.Tsymbaliuk.javacore.lambdaFunction.sample2;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        SimpleClass sc = new SimpleClass(array);
        Summator summator = sc.getSummatorInstance();
        System.out.println(summator.getSum());
    }
}
