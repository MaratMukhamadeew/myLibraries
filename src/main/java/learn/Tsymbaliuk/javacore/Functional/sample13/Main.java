package learn.Tsymbaliuk.javacore.Functional.sample13;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        DoubleToIntFunction fun = Main::convert;

        System.out.println(fun.applyAsInt(1.99));
    }

    public static int convert(double num) {
        return (int) num;
    }
}
