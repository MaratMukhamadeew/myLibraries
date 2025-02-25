package learn.Tsymbaliuk.javacore.UnaryOperator.sample7;

import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        IntUnaryOperator unOp = Main::factorial;

        System.out.println(unOp.applyAsInt(5));
    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
