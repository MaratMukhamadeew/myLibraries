package learn.Tsymbaliuk.javacore.UnaryOperator.sample1;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> unOp1 = new UOp();
        System.out.println(unOp1.apply("Hello World"));
    }
}

class UOp implements UnaryOperator<String> {
    @Override
    public String apply(String t) {
        return t.toLowerCase();
    }
}
