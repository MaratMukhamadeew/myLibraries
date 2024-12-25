package learn.programming_methods.glava2.threads.thread;

public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("End of main with Exception");
        throw new RuntimeException();
    }
}
