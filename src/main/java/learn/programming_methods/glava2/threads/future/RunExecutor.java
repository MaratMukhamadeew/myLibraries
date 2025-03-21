package learn.programming_methods.glava2.threads.future;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunExecutor {
    public static void main(String[] args) throws Exception {
        ArrayList<Future<String>> list = new ArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 7; i++) {
            list.add(es.submit(new BaseCallable()));
        }
        es.shutdown();
        for(Future<String> future : list) {
            System.out.println(future.get() + " result fixed");
        }
    }
}
