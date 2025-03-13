package learn.Tsymbaliuk.javacore.BinaryOperator.sample2;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> binOp1 = Integer::sum;

        BinaryOperator<Integer> binOp2 = Main::sum;

        System.out.println(binOp1.apply(1, 3));
        System.out.println(binOp2.apply(1, 3));
    }

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
