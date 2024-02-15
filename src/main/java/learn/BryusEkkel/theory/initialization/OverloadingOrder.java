package learn.BryusEkkel.theory.initialization;

import static learn.BryusEkkel.util.Print.*;

public class OverloadingOrder {
    static void f(String str,int i) {
        print("String: " + str + ", int: " + i);
    }
    static void f(int i,String str) {
        print("int: " + i + ", String: " + str);
    }

    public static void main(String[] args) {
        f("Сначала строка", 11);
        f(99, "Сначала число");
    }
}
