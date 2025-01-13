package learn.Tsymbaliuk.javacore.defaultMethods.sample4;

public class C implements A, B {
    private String text;

    public C(String text) {
        super();
        this.text = text;
    }

    @Override
    public String toString() {
        return "C{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return text + " " + text;
    }
}
