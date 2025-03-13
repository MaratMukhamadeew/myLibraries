package learn.Tsymbaliuk.javacore.UnaryOperator.sample6;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> unOp = UnaryOperator.identity();

        System.out.println(unOp.apply(5));
    }
}
