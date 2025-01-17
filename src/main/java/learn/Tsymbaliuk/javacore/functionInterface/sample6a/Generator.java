package learn.Tsymbaliuk.javacore.functionInterface.sample6a;

import java.util.ArrayList;

@FunctionalInterface
public interface Generator<T> {
    ArrayList<T> createNewObject();
}
