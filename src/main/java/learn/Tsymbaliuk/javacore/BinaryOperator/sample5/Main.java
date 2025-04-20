package learn.Tsymbaliuk.javacore.BinaryOperator.sample5;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comp = Comparator.comparingInt(String::length);

        BinaryOperator<String> binOp = BinaryOperator.maxBy(comp);

        String result = binOp.apply("Java", "Python");

        System.out.println(result);
    }
}
