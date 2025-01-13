package learn.Tsymbaliuk.javacore.defaultMethods.sample3;

public class RealizationA implements A {
    private String text;

    public RealizationA() {
        this.text = "Default text";
    }

    public RealizationA(String text) {
        super();
        this.text = text;
    }

    @Override
    public String getMessage() {
        return text + " " + text;
    }

    @Override
    public String toString() {
        return "RealizationA{" +
                "text='" + text + '\'' +
                '}';
    }
}
