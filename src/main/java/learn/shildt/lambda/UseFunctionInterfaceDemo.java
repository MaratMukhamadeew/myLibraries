package learn.shildt.lambda;

// Использовать встроенный функциональный интерфейс Function

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println("Факториал числа 5 равен: " + factorial.apply(5));
        System.out.println("Факториал числа 7 равен: " + factorial.apply(7));
    }
}
