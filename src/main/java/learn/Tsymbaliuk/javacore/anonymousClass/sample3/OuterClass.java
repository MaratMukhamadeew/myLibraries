package learn.Tsymbaliuk.javacore.anonymousClass.sample3;

public class OuterClass {
    private String text;
    public Comparable<String> cmp = new Comparable<>() {
        @Override
        public int compareTo(String o) {
            return OuterClass.this.text.compareTo(o);
        }
    };

    public OuterClass(String text) {
        super();
        this.text = text;
    }
}
