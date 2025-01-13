package learn.Tsymbaliuk.javacore.defaultMethods.sample3;

public interface A {
    default String getMessage() {
        return "Hello world interface A";
    }
}
