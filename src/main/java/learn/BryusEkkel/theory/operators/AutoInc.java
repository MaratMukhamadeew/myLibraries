package learn.BryusEkkel.theory.operators;

import static learn.BryusEkkel.util.Print.*;
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i); // Префиксный инкремент
        print("i++ : " + i++); // Постфикный инкремент
        print("i : " + i);
        print("--i : " + --i); // Префиксный декремент
        print("i-- : " + i--); // Постфикный декремент
        print("i : " + i);
    }
}
