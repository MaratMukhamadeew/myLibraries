package learn.Tsymbaliuk.javacore.anonymousClass.sample4;


public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass("Cat");
        System.out.println(oc.cmp.compareTo("Hello"));
        System.out.println(oc.cmp.getClass().getName());
    }
}
