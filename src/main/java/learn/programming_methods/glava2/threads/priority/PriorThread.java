package learn.programming_methods.glava2.threads.priority;

public class PriorThread extends Thread {
    public PriorThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public PriorThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(100); // Остановка на 100 миллисекунд
            } catch (InterruptedException e) {
                System.err.print(e.getMessage());
            }
        }
    }
}
