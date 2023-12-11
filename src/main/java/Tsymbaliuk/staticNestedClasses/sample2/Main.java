package Tsymbaliuk.staticNestedClasses.sample2;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass("world");
        OuterClass.NestedClass on = new OuterClass.NestedClass("Hello");
        on.printText(oc);
    }
}
