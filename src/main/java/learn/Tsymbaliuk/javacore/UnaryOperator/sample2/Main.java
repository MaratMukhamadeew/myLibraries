package learn.Tsymbaliuk.javacore.UnaryOperator.sample2;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<Integer> unOp1 = a -> -a;

        UnaryOperator<Integer> unOp2 = Main::negative;

        System.out.println(unOp1.apply(3));
        System.out.println(unOp2.apply(3));
    }
    public static Integer negative(Integer number) {
        return -number;
    }
}
