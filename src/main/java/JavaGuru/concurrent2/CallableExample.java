package JavaGuru.concurrent2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.*;

public class CallableExample implements Callable<Integer> {
    private String word;

    public CallableExample(String word) {
        this.word = word;
    }

    public Integer call() {
        System.out.println(Thread.currentThread().getName() + ", длина слова : " + word.length());
        return word.length();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");

        ExecutorService pool = Executors.newFixedThreadPool(10);
        Set<Future<Integer>> set = new HashSet<>();
        for (String word : strings) {
            Callable<Integer> callable = new CallableExample(word);
            Future<Integer> future = pool.submit(callable);
            set.add(future);
        }

        int sum = 0;
        for (Future<Integer> future : set) {
            sum += future.get();
        }
        System.out.println("The sum of length is " + sum);
        pool.shutdown();
    }
}
