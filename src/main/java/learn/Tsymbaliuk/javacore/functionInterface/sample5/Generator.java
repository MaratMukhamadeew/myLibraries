package learn.Tsymbaliuk.javacore.functionInterface.sample5;

@FunctionalInterface
public interface Generator {
    int getNextElement(IntGenerator gen);
}
