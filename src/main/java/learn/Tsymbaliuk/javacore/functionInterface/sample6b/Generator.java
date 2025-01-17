package learn.Tsymbaliuk.javacore.functionInterface.sample6b;

@FunctionalInterface
public interface Generator {
    Object createNewObject(int size);
}
