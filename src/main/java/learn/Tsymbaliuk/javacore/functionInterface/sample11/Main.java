package learn.Tsymbaliuk.javacore.functionInterface.sample11;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String[]> fun = functionComposition(Main::intToStr, Main::strToStrArray);

        String[] res = fun.apply(5);
        System.out.println(Arrays.toString(res));
    }

    public static <F, S, R> Function<F, R> functionComposition(Function<F, S> f1, Function<S, R> f2) {
        class Composition {
            public R comp(F t) {
                S temp = f1.apply(t);
                return f2.apply(temp);
            }
        }
        Composition a = new Composition();
        return a::comp;
    }

    public static String intToStr(Integer count) {
        return "Hello " + count;
    }

    public static String[] strToStrArray(String text) {
        String[] r = text.split(" ");
        String[] result = new String[Integer.valueOf(r[1])];
        for (int i = 0; i < result.length; i++) {
            result[i] = r[0];
        }
        return result;
    }
}
