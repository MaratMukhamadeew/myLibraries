package learn.Tsymbaliuk.javacore.Functional.sample11;

import java.util.Date;
import java.util.function.LongFunction;

public class Main {
    public static void main(String[] args) {
        LongFunction<Date> fun = Date::new;

        System.out.println(fun.apply(4_00_000_000_000L));
    }
}
