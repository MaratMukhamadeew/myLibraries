package learn.BryusEkkel.theory.control;

import static learn.BryusEkkel.util.Print.*;
import static learn.BryusEkkel.util.Range.*;
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10))
            printnb(i + " ");
        print();
        for (int i : range(5, 10))
            printnb(i + " ");
        print();
        for (int i : range(5, 20, 3))
            printnb(i + " ");
        print();
    }
}
