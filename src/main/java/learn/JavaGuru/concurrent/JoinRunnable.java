package learn.JavaGuru.concurrent;

public class JoinRunnable extends Thread {
    public JoinRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            System.out.println(currentThreadName + " is running! " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(currentThreadName + " completed");
    }

    public static void main(String[] args) {
        JoinRunnable a = new JoinRunnable("A");
        JoinRunnable b = new JoinRunnable("B");
        JoinRunnable c = new JoinRunnable("C");
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        a.start();
        b.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        c.start();
    }
}
