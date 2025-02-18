package learn.Tsymbaliuk.javacore.var.sample7;

public class Main {
    public static void main(String[] args) {
        String[] array = { "Hello", "World" };

        for (var elem : array) {
            System.out.println(elem);
        }
    }
}
