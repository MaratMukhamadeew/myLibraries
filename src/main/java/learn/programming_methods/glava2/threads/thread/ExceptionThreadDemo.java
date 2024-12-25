package learn.programming_methods.glava2.threads.thread;

public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(5000);
        System.out.println("End of main");
    }
}
