package learn.Tsymbaliuk.javacore.Supplier.sample3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<List<String>> sup = ArrayList::new;

        List<String> list = sup.get();

        System.out.println(list);
    }
}
