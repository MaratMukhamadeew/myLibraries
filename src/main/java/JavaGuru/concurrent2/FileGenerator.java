package JavaGuru.concurrent2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class FileGenerator implements Callable<List<String>> {
    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> files = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String fileName = "e://" + threadName + "_" + ".txt";
            files.add(fileName);
            try (OutputStream ou = new BufferedOutputStream(new FileOutputStream(fileName))) {
                ou.write(("Java " + i).getBytes());
                ou.flush();
                System.out.println(threadName + " записал файл " + fileName);
            }
        }
        Thread.sleep(1000);
        return files;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> fileGenerator = new FileGenerator();
            Future<List<String>> future = pool.submit(fileGenerator);
            futures.add(future);
        }

        ArrayList<String> resultList = new ArrayList<>();
        for (Future<List<String>> future : futures) {
            resultList.addAll(future.get());
        }
        System.out.println(resultList);
        pool.shutdown();
    }
}
