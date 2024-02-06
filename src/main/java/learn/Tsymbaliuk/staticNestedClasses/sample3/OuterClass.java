package learn.Tsymbaliuk.staticNestedClasses.sample3;

public class OuterClass {
    private String text;
    private static int number = 10;

    public OuterClass(String text) {
        super();
        this.text = text;
    }

    public class InnerClass {
        private int pages = 10;
    }

    public static class SuperNestedClass {
        private String author = "Jimmy";
    }

    public static class NestedClass extends SuperNestedClass {
        private String word;

        public NestedClass(String word) {
            this.word = word;
        }

        public void printText(OuterClass oc) {
            System.out.println(word + " " + number + " " + oc.text);
        }
    }
    public static class NestedClass2 extends InnerClass {
        private String word;

        public NestedClass2(OuterClass oc, String word) {
            oc.super();
            this.word = word;
        }

        public void printText(OuterClass oc) {
            System.out.println(word + " " + number + " " + oc.text);
        }
    }
}
