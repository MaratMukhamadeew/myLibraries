package learn.Tsymbaliuk.javacore.defaultMethods.sample1;

public class ClassA implements SampleInterface {
    private String message;

    public ClassA(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ClassA [message = " + message + "]";
    }
}
