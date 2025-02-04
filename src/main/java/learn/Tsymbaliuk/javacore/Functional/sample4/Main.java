package learn.Tsymbaliuk.javacore.Functional.sample4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Function<Integer, BigInteger> fun = n -> {
            BigInteger factorial = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
            }
            return factorial;
        };

        List<BigInteger> resList = applyAndCreate(fun, numbers);
        System.out.println(resList);
    }

    public static <R, T> List<R> applyAndCreate(Function<T, R> fun, List<T> list) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            resultList.add(fun.apply(t));
        }
        return resultList;
    }
}
