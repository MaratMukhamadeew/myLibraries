package learn.Tsymbaliuk.javacore.defaultMethods.sample1;

public class ClassB implements SampleInterface {
    private String message;

    public ClassB(String message) {
        super();
        this.message = message;
    }

    @Override
    public String toString() {
        return "ClassB [message = " + message + "]";
    }
}
