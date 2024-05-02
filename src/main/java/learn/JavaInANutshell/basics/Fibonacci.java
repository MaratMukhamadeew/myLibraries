package learn.JavaInANutshell.basics;
/**
 * Эта программа распечатывает 20 первых чисел ряда Фибоначчи.
 * Каждый его элемент формируется как сумма двух предыдущих элементов ряда,
 * начиная с 1 и 1.
 * */
public class Fibonacci {
    public static void main(String[] args) {
//        printFibonacci2(10);
//        System.out.println(printStr("hello world", 1, 6));
        System.out.println(reverse("quit"));

    }
    public static void printFibonacci(int n) {
        int n0 = 1, n1 = 1, n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i < n - 2; i++) {
            n2 = n1 + n0;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
    public static void printFibonacci2(int n) {
        int n0 = 1, n1 = 1, n2 = 2, n3;
        System.out.print(n0 + " " + n1 + " " + n2 + " ");
        for (int i = 0; i < n - 3; i++) {
            n3 = n2 + n1 + n0;
            System.out.print(n3 + " ");
            int tnp = n2;
            n2 = n2 + n1 + n0;
            n0 = n1;
            n1 = tnp;
        }
        System.out.println();
    }

    public static String printStr(String str, int begin, int end) {
        return str.substring(begin, end + begin);
    }
    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
