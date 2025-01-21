package learn.Tsymbaliuk.javacore.lambdaFunction.sample5;

@FunctionalInterface
public interface Modificator<T> {
    T modification(T element);
}
