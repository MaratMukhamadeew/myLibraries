package learn.Tsymbaliuk.javacore.defaultMethods.sample5;

public interface B {
    default String getMessage() {
        return "Hello interface B";
    }
}
