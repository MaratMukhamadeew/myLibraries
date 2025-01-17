package learn.Tsymbaliuk.javacore.functionInterface.sample6a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generator<String> gen = ArrayList::new;
        ArrayList<String> a = gen.createNewObject();
        System.out.println(a.getClass());
    }
}
