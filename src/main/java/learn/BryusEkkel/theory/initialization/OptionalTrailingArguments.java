package learn.BryusEkkel.theory.initialization;

public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("Обязательно: " + required + " ");
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "один");
        f(2, "два", "три");
        f(5, "пять", "три");
        f(0);
    }
}
