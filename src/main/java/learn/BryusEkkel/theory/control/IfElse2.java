package learn.BryusEkkel.theory.control;

import static learn.BryusEkkel.util.Print.*;
public class IfElse2 {
    static int test(int testVal, int target, int begin, int end) {
        if (testVal > target && testVal >= begin && testVal <= end)
            return + 1;
        else if (target > testVal  && testVal >= begin && testVal <= end)
            return - 1;
        else return 0; // Одинаковые значения
    }



    public static void main(String[] args) {
        print(test(10,5, 5,15));
        print(test(5,10, 5,15));
        print(test(5,5, 5,15));
        print(test(25,5, 5,15));
        print(test(-5,5, 5,15));
    }
}
