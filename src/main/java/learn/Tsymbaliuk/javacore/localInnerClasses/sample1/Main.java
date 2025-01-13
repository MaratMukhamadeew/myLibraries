package learn.Tsymbaliuk.javacore.localInnerClasses.sample1;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        System.out.println(oc.getLengthComparator().compare("Cat", "Lion"));
    }
}
