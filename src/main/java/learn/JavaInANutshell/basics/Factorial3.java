package learn.JavaInANutshell.basics;

import java.math.BigInteger;
import java.util.ArrayList;

public class Factorial3 {
    protected static ArrayList<BigInteger> table = new ArrayList<>();

    static {
        table.add(BigInteger.valueOf(1));
    }

    public static synchronized BigInteger factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть неотрицательным.");
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastFact = table.get(size - 1);
            BigInteger nextFact = lastFact.multiply(BigInteger.valueOf(size));
            table.add(nextFact);
        }
        return table.get(x);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + " != " + factorial(i));
        }
    }
}
