package learn.JavaInANutshell.basics;

public class Factorial2 {
    static long[] table = new long[21];

    static {
        table[0] = 1;
    }

    static int last = 0;

    public static long factorial(int x) throws IllegalArgumentException {
        if (x >= table.length) throw new IllegalArgumentException("Переполнение: x слишком велик.");
        if (x < 0) throw new IllegalArgumentException("x должен быть неотрицательным.");
        while (last < x) {
            table[last + 1] = table[last] * (last + 1);
            last++;
        }
        return table[x];
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
}
