package learn.Tsymbaliuk.javacore.functionInterface.sample7;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();

        Modifier<Integer> a = ng::add;

        Modifier<Double> b = ng::add;

        Modifier<String> c = ng::add;

        int aa = a.change(10);
        double bb = b.change(10.0);
        String cc = c.change("50a");

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
}
