package learn.Tsymbaliuk.javacore.UnaryOperator.sample8;

import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {

        IntUnaryOperator unOp1 = a -> a + 1;

        IntUnaryOperator unOp2 = a -> 2 * a;

        IntUnaryOperator result = unOp1.andThen(unOp2);

        System.out.println(result.applyAsInt(3));
    }
}
