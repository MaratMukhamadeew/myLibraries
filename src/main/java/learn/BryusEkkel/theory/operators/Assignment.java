package learn.BryusEkkel.theory.operators;

import static learn.BryusEkkel.util.Print.*;

// Присваивание объектов имеет ряд хитростей
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}

class Tank {
    int level;
}