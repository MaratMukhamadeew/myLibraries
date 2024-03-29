package learn.shildt.lambda;

// Применить обобщенный функциональный интерфейс с разнотипными лямбда-выражениями

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--)
                result.append(str.charAt(i));
            return result.toString();
        };
        System.out.println("Лямбда обращается на: " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на: " + reverse.func("Выражение"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) result *= i;

            return result;
        };
        System.out.println("Факториал числа 3 равен: " + factorial.func(3));
        System.out.println("Факториал числа 5 равен: " + factorial.func(5));
    }
}
