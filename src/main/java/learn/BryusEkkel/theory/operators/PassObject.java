package learn.BryusEkkel.theory.operators;

import static learn.BryusEkkel.util.Print.*;

// Передача объектов методам может работать не так, как вы привыкли
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("1: x.c: " + x.c);
    }
}

class Letter {
    char c;
}
