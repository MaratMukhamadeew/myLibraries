package learn.Tsymbaliuk.javacore.BinaryOperator.sample3;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        BinaryOperator<Integer> binOp1 = Integer::sum;
        Integer s1 = reduce(list1, binOp1, 0);
        System.out.println(s1);

        List<String> list2 = List.of("Hello", "Java", "world");
        BinaryOperator<String> binOp2 = (a, b) -> a + " " + b;
        String s2 = reduce(list2, binOp2, "");
        System.out.println(s2);
    }

    public static <T> T reduce(List<T> list, BinaryOperator<T> binOp, T startValue) {
        T result = startValue;
        for (T elem : list) {
            result = binOp.apply(result, elem);
        }

        return result;
    }
}
