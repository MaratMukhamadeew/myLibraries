package learn.Tsymbaliuk.javacore.Functional.sample6;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String[]> fun1 = str -> str.split(" ");

        Function<String[],int[]> fun2 = Main::getLength;

        Function<String, int[]> fun3 = fun1.andThen(fun2);

        Function<String, int[]> fun4 = fun2.compose(fun1);

        int[] result1 = fun3.apply("Java the best");
        int[] result2 = fun4.apply("Java the best");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    public static int[] getLength(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i].length();
        }
        return result;
    }
}

