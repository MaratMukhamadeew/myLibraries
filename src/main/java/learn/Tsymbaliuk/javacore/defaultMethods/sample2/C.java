package learn.Tsymbaliuk.javacore.defaultMethods.sample2;

public class C implements B {
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
}
