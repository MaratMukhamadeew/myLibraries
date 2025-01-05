package learn.programming_methods.glava2.threads.future;

import java.util.Random;
import java.util.concurrent.Callable;

public class CalcCallable implements Callable<Number> {
    @Override
    public Number call() {
        return new Random().nextGaussian(); // Имитация вычислений
    }
}
