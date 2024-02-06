package learn.JavaGuru.concurrent;

public class IsAliveExample {
    public static void main(String[] args) throws InterruptedException{
        RunnableExample myRunnable = new RunnableExample("Поток 1");

        Thread thread = new Thread(myRunnable);
        System.out.println("Before starting: " + thread.isAlive());
        thread.start();
        System.out.println("After starting: " + thread.isAlive());
        thread.join();
        System.out.println("After thread completed: " + thread.isAlive());
    }
}
