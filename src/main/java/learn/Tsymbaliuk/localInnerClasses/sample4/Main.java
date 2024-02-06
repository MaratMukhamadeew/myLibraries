package learn.Tsymbaliuk.localInnerClasses.sample4;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            class Printer {
                private String text;

                public Printer(String text) {
                    this.text = text;
                }

                public void print() {
                    System.out.println("*** " + text + " ***");
                }
            }

            Printer printer = new Printer("Hello");
            printer.print();

        }
    }
}
