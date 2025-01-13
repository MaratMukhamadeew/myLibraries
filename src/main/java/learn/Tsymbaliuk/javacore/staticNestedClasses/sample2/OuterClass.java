package learn.Tsymbaliuk.javacore.staticNestedClasses.sample2;

public class OuterClass {
    private String text;
    private static int number = 10;

    public OuterClass(String text) {
        super();
        this.text = text;
    }

    public static class NestedClass {
        private String word;

        public NestedClass(String word) {
            super();
            this.word = word;
        }

        public void printText(OuterClass oc) {
            System.out.println(word + " " + number + " " + oc.text);
        }
    }
}
