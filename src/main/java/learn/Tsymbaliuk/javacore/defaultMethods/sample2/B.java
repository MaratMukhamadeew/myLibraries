package learn.Tsymbaliuk.javacore.defaultMethods.sample2;

public interface B extends A {
    @Override
    default String getMessage() {
        return "Hello world interface B";
    }
}
