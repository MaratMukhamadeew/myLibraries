package learn.programming_methods.glava2.threads.management;

public class JoinRunner {
    static {
        System.out.println("Старт потока main");
    }

    public static void main(String[] args) {
        JoinThread t1 = new JoinThread("First");
        JoinThread t2 = new JoinThread("Second");
        t1.start();
        t2.start();
        try {
            t1.join(); // Поток main остановлен до окончания работы потока t1
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName()); // Имя текущего потока
    }
}
