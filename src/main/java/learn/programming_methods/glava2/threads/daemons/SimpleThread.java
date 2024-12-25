package learn.programming_methods.glava2.threads.daemons;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            if (this.isDaemon()) {
                System.out.println("Старт потока-демона");
                Thread.sleep(10_000);
            } else {
                System.out.println("Старт обычного потока");
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        } finally {
            if (!isDaemon()) {
                System.out.println("Завершение обычного потока");
            } else {
                System.out.println("Завершение потока-демона");
            }
        }
    }
}
