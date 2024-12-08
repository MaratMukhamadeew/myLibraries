package learn.JavaGuru.lambda;

public class MathTest {
    @FunctionalInterface
    interface MathInterface<T> {
        T getMax(T first, T next);
    }

    static void print(MathInterface<Integer> m) {
        System.out.println(m.getMax(324, 35));
    }

    public static void main(String[] args) {
        MathInterface<Integer> m = (first, next) -> first > next ? first : next ;

        print(m);
    }
}
