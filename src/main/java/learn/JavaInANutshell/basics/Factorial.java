package learn.JavaInANutshell.basics;
/**
 * Факториал
 * */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial2(5));
    }
    public static int factorial1(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть >= 0");
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long factorial2(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть >= 0");
        if (x <= 1) return 1;
        else return x * factorial2(x - 1);
    }
}
