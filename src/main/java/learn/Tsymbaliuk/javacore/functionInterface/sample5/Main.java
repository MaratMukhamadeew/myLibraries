package learn.Tsymbaliuk.javacore.functionInterface.sample5;

public class Main {
    public static void main(String[] args) {
        Generator gen = IntGenerator::next;
        IntGenerator a = new IntGenerator();
        System.out.println(gen.getNextElement(a));
    }
}
