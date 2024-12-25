package learn.programming_methods.glava2.threads.thread;

public class ExceptThread extends Thread {
    @Override
    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("Конец ExceptThread");
    }
}
