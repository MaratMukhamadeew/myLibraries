package learn.Tsymbaliuk.javacore.defaultMethods.sample4;

public interface A {
    default String getMessage() {
        return "hello interface A";
    }
}
