package learn.Tsymbaliuk.innerClasses.sample3;

public class Outer {
    private int id;
    public Outer(int id) {
        super();
        this.id = id;
    }
    public Outer() {
        super();
    }
    public class Inner {
        private String text;

        public Inner(String text) {
            super();
            this.text = text;
        }

        public String getTotalInfo() {
            return text + " " + id;
        }
    }
}
