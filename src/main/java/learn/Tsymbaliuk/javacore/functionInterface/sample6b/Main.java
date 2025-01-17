package learn.Tsymbaliuk.javacore.functionInterface.sample6b;

public class Main {
    public static void main(String[] args) {
        Generator gen = int[]::new;

        Object a = gen.createNewObject(10);

        System.out.println(a.getClass());
    }
}
