package learn.Tsymbaliuk.javacore.functionInterface.sample8;

@FunctionalInterface
public interface IntElementGenerator {
    Integer next(Integer current);
}
