package learn.Tsymbaliuk.javacore.defaultMethods.sample3;
public interface B extends A {
    @Override
    default String getMessage() {
        return "Hello world interface B";
    }
}
