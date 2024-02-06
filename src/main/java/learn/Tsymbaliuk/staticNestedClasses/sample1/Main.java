package learn.Tsymbaliuk.staticNestedClasses.sample1;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass on = new OuterClass.NestedClass("Hello");
        on.printText();
    }
}
