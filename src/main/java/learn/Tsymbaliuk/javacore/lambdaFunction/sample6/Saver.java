package learn.Tsymbaliuk.javacore.lambdaFunction.sample6;

import java.io.IOException;

@FunctionalInterface
public interface Saver {
    void save(Object obj) throws IOException;
}
