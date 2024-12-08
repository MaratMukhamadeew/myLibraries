package learn.JavaGuru.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaReturnTask {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        int arraySize = random.nextInt(30);
        for (int i = 0; i < arraySize; i++) {
            integerList.add(random.nextInt(100));
        }

        System.out.println(integerList);
        System.out.println(integerList.size());
        System.out.println(action(arraySize).execute(integerList));

    }

    interface Operation<V, T> {
        V execute(T t);
    }

    private static Operation action(int arraySize) {
        if (arraySize > 20) {
            return (Operation<Integer, List<Integer>>) l -> {
                int sum = 0;
                for(int i : l)
                    sum = sum + i;
                return sum;
            };
        } else if (arraySize > 10) {
            return (Operation<String, List<Integer>>) l -> {
                StringBuilder result = new StringBuilder();
                for(int i : l)
                    result.append(i);
                return result.toString();
            };
        } else {
            return (Operation<Integer, List<Integer>>) l -> {
                int result = 1;
                for(int i : l)
                    result = result * i;
                return result;
            };
        }
    }

}
