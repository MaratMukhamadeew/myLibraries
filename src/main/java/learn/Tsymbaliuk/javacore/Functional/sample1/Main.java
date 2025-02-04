package learn.Tsymbaliuk.javacore.Functional.sample1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> fun = new StrToLength();
        System.out.println(fun.apply("Hello"));
    }
}

class StrToLength implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
