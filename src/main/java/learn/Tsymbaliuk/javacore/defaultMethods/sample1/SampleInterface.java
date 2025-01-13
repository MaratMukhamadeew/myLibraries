package learn.Tsymbaliuk.javacore.defaultMethods.sample1;

public interface SampleInterface {
    default String getMessage() {
        return "Default message";
    }
}
