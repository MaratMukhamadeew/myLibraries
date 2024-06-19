package learn.JavaGuru.concurrent2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class EventHandler implements Callable {

    private LocalDateTime eventDate;

    public EventHandler(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String call() throws InterruptedException {
        long d = 0;
        while ((d = Duration.between(LocalDateTime.now(), eventDate).toSeconds()) >= 0) {
            System.out.println("Event: " + Thread.currentThread().getName() + " will be started in " +
                    d + " seconds");
            Thread.sleep(1000);
        }

        return "Event: " + Thread.currentThread().getName() + " started";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        LocalDateTime dateTime1 = LocalDateTime.now();
        Callable<String> eventHandler1 = new EventHandler(dateTime1.plusSeconds(5));
        Callable<String> eventHandler2 = new EventHandler(dateTime1.plusSeconds(10));
        Callable<String> eventHandler3 = new EventHandler(dateTime1.plusSeconds(15));
        Callable<String> eventHandler4 = new EventHandler(dateTime1.plusSeconds(20));
        Callable<String> eventHandler5 = new EventHandler(dateTime1.plusSeconds(25));

        Future<String> res1 = pool.submit(eventHandler1);
        Future<String> res2 = pool.submit(eventHandler2);
        Future<String> res3 = pool.submit(eventHandler3);
        Future<String> res4 = pool.submit(eventHandler4);
        Future<String> res5 = pool.submit(eventHandler5);

        System.out.println(res1.get());
        System.out.println(res2.get());
        System.out.println(res3.get());
        System.out.println(res4.get());
        System.out.println(res5.get());

        pool.shutdown();
    }
}
