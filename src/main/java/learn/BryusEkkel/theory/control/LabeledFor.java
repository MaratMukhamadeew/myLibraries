package learn.BryusEkkel.theory.control;

import static learn.BryusEkkel.util.Print.*;
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:      // Другие команды недоступны
        for (; true ;)
            inner:  // Другие команды недоступны
        for (; i < 10; i++) {
            print("i = " + i);
            if (i == 2) {
                print("continue");
                continue;
            }
            if (i == 3){
                print("break");
                i++; // В противном случае значение i
                    // не увеличивается
                break;
            }
            if (i == 7){
                print("continue outer");
                i++; // В противном случае значение i
                // не увеличивается
                continue outer;
            }
            if (i == 8) {
                print("break outer");
                break outer;
            }
            for (int k = 0; k < 5; k++) {
                if (k == 3) {
                    print("continue inner");
                    continue inner;
                }
            }
        }
    }
}
