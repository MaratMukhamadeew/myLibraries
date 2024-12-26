package learn.programming_methods.glava2.threads.instruction;

public class TwoThread {
    public static int counter = 0;

    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder();
        new Thread(() -> {
            synchronized (sb) {
                do {
                    sb.append("A");
                    System.out.println(sb);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.err.println(ex.getMessage());
                    }
                } while (TwoThread.counter++ < 2);
            } // Конец synchronized
        }).start();
        new Thread(() -> {
            synchronized (sb) {
                while (TwoThread.counter++ < 6) {
                    sb.append("B");
                    System.out.println(sb);
                }
            } // Конец synchronized
        }).start();
    }
}
