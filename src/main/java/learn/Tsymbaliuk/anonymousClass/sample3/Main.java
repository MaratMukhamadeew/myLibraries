package learn.Tsymbaliuk.anonymousClass.sample3;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass("Cat");
        System.out.println(oc.cmp.compareTo("Hello"));
    }
}
