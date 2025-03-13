package learn.Tsymbaliuk.javacore.BinaryOperator.sample6;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperator binOp = Main::gcb;

        System.out.println(binOp.applyAsInt(20, 15));
    }

    public static int gcb(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        for (; r != 0;) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
