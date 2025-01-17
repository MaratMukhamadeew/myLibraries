package learn.Tsymbaliuk.javacore.functionInterface.sample7;

@FunctionalInterface
public interface Modifier<T> {
    T change(T obj);
}
