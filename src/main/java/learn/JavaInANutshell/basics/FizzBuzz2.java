package learn.JavaInANutshell.basics;
/**
 * Этот класс очень похож на класс FizzBuzz, но в нем вместо повторяющихся операторов if/else
 * применяется оператор switch
 * */
public class FizzBuzz2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            switch (i % 35) {
                case 0 -> System.out.print("fizzbuzz ");
                case 5, 10, 15, 20, 25, 30 -> System.out.print("fizz ");
                case 7, 14, 21, 28 -> System.out.print("buzz ");
                default -> System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(2 % 35);
    }
}
