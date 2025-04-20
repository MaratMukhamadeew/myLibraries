package learn.Tsymbaliuk.javacore.Supplier.Sample1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> counter = new IntegerSequince(0, 10, 1);
        Integer number;
        for (; (number = counter.get()) != null;) {
            System.out.println(number);
        }
    }
}

class IntegerSequince implements Supplier<Integer> {
    private Integer start;
    private Integer end;
    private Integer step;

    public IntegerSequince(Integer start, Integer end, Integer step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Integer get() {
        if (start > end) {
            return null;
        }
        start += step;
        return start - step;
    }
}
