package learn.Tsymbaliuk.javacore.defaultMethods.sample5;

public interface A {
    default String getMessage() {
        return "Hello interface A";
    }
}
