package learn.BryusEkkel.theory.initialization;

import static learn.BryusEkkel.util.Print.*;
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        print("Конструктор с параметром int, petalCount = " + petalCount);
    }
    Flower(String ss) {
        s = ss;
        print("Конструктор с параметром String, s = " + ss);
    }
    Flower(String s, int petals) {
        this(petals);
//        this(s);   Вызов другого конструктора запрещен!
        this.s = s;
        print("petalCount = " + petalCount + ", s = " + s);
    }
    Flower() {
        this("Hi",47);
        print("Конструктор по умолчанию (без аргументов)");
    }
    void printPetalCounts() {
//        this(11);  Разрешается только в конструкторах
        print("petalCount = " + petalCount + ", s = " + s);
    }

    public static void main(String[] args) {
        Flower f = new Flower();
        f.printPetalCounts();
    }
}
