package learn.Tsymbaliuk.javacore.BinaryOperator.sample1;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> binOp = new StringConcat(5);

        String text = binOp.apply("Hello", "Cat");

        System.out.println(text);
    }
}

class StringConcat implements BinaryOperator<String> {
    private int minLength;

    public StringConcat(int minLength) {
        super();
        this.minLength = minLength;
    }

    @Override
    public String apply(String t1, String t2) {
        String a = t1.length() >= minLength ? t1 : "";
        String b = t2.length() >= minLength ? t2 : "";
        return a + b;
    }
}