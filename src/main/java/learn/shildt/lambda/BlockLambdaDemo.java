package learn.shildt.lambda;

// Блочное лямбда-выражение, вычисляющее факториал целочисленного значения

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) result *= i;

            return result;
        };
        System.out.println("Факториал числа 3 равен: " + factorial.func(3));
        System.out.println("Факториал числа 5 равен: " + factorial.func(5));
    }
}
