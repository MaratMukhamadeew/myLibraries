package learn.programming_methods.glava2.threads.management;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Старт потока " + nameT);
        try {
            switch (nameT) {
                case "First" -> timeout = 5_000;
                case "Second" -> timeout = 1_000;
            }
            Thread.sleep(timeout);
            System.out.println("Завершение потока " + nameT);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
