package learn.Tsymbaliuk.javacore.functionInterface.sample8;

public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();

        IntElementGenerator ieg = gen::<Integer>nextElement;
    }
}
