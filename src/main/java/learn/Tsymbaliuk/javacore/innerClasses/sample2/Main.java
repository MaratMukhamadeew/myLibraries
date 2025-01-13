package learn.Tsymbaliuk.javacore.innerClasses.sample2;

public class Main {
    public static void main(String[] args) {
        StringWrapper sw = new StringWrapper("Hello world!");

        for (Character ch : sw) {
            System.out.println(ch);
            for (Character d : sw) {
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
