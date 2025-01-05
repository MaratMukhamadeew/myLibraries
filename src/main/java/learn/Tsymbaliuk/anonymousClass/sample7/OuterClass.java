package learn.Tsymbaliuk.anonymousClass.sample7;

public class OuterClass {
    private String text;

    public Comparable<String> cmp = new Comparable<>() {
        public int direction;
        {
            direction = 1;
        }
        @Override
        public int compareTo(String o) {
            return (OuterClass.this.text.length() - o.length()) * direction;
        }
    };

    public OuterClass(String text) {
        this.text = text;
    }
    public int compareLength(String text) {
        return cmp.compareTo(text);
    }
}
