package learn.Tsymbaliuk.javacore.defaultMethods.sample4;

public interface B {
    default String getMessage() {
        return "Hello interface B";
    }
}
