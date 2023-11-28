package shildt.string;

// Продемонстрировать применение разных форм методов indexOf() и lastIndexOf()

public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "Now is the time for all good men to come to the aid of their country.";
        System.out.println(str);

        System.out.println("indexOf('t') = " + str.indexOf('t'));
        System.out.println("lastIndexOf('t') = " + str.lastIndexOf('t'));
        System.out.println("indexOf(\"the\") = " + str.indexOf("the"));
        System.out.println("lastIndexOf(\"the\") = " + str.lastIndexOf("the"));
        System.out.println("indexOf('t', 10) = " + str.indexOf('t', 10));
        System.out.println("lastIndexOf('t', 10) = " + str.lastIndexOf('t', 60));
        System.out.println("indexOf(\"the\", 10) = " + str.indexOf("the",10));
        System.out.println("lastIndexOf(\"the\", 60) = " + str.lastIndexOf("the",60));
    }
}
