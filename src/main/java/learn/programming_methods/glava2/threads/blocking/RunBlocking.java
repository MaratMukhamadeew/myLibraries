package learn.programming_methods.glava2.threads.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RunBlocking {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                try {
                    queue.put("Java " + i); // Добавление 3-х
                    System.out.println("Element " + i + " added");
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1_000);
                // Извлечение одного
                System.out.println("Element " + queue.take() + " took");
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }).start();
    }
}
