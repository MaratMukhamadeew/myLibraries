package learn.Tsymbaliuk.javacore.defaultMethods.sample2;

public interface A {
    default String getMessage() {
        return "Hello world interface A";
    }
}
