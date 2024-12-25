package learn.programming_methods.glava2.threads;

public class WalkRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(500); // Остановка на 500 миллисекунд
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
