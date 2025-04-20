package learn.Tsymbaliuk.javacore.UnaryOperator.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        UnaryOperator<Integer> unOp = a -> a * 2;

        list.replaceAll(unOp);

        System.out.println(list);
    }
}
