package learn.Tsymbaliuk.javacore.functionInterface.sample9a;

import java.io.IOException;

@FunctionalInterface
public interface Saver<T> {
    void saveTo(T element) throws IOException;
}
