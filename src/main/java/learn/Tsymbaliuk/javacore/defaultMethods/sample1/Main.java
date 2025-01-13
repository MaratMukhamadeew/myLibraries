package learn.Tsymbaliuk.javacore.defaultMethods.sample1;

public class Main {
    public static void main(String[] args) {
        SampleInterface a = new ClassA("Hello A");
        SampleInterface b = new ClassB("Hello B");

        System.out.println(a.getMessage());
        System.out.println(b.getMessage());
    }
}
