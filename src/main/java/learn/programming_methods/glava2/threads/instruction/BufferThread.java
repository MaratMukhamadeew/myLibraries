package learn.programming_methods.glava2.threads.instruction;

public class BufferThread {
    public static int counter = 0;
    static final StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (sb) {
                do {
                    sb.append("A");
                    System.out.print("> " + counter + " ");
                    System.out.println(sb);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.err.println(ex.getMessage());
                    }
                } while (BufferThread.counter++ < 3);
            } // Конец synchronized
        }).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        while (BufferThread.counter++ < 6) {
            System.out.print("< " + counter + " ");
            // В этом месте поток main будет ждать освобождения блокировки объекта sb
            sb.append("B");
            System.out.println(sb);
        }
    }
}
