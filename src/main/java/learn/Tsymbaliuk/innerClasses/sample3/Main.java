package learn.Tsymbaliuk.innerClasses.sample3;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(22);
        InnerSubclass is = new InnerSubclass(outer);

        System.out.println(is.getTotalInfo());
    }
}
