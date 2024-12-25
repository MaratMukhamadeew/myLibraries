package learn.programming_methods.glava2.threads.thread;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("End of SimpleThread");
    }
}
