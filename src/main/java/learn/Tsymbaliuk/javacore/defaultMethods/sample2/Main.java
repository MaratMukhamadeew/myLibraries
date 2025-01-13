package learn.Tsymbaliuk.javacore.defaultMethods.sample2;

public class Main {
    public static void main(String[] args) {
        C classC = new C("Hello");
        A interfaceA = classC;
        B interfaceB = classC;

        System.out.println(classC.getMessage());
        System.out.println(interfaceA.getMessage());
        System.out.println(interfaceB.getMessage());
    }
}
