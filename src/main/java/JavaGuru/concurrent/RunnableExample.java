package JavaGuru.concurrent;

public class RunnableExample implements Runnable {
    private String localName;

    public RunnableExample(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Лямбда"));
        Thread thread2 = new Thread(new RunnableExample("Поток 2"));
        Thread thread3 = new Thread(new RunnableExample("Поток 3"));
        Thread thread4 = new Thread(new RunnableExample("Поток 4"));
        Thread thread5 = new Thread(new RunnableExample("Поток 5"));
        Thread thread6 = new Thread(new RunnableExample("Поток 6"));
        Thread thread7 = new Thread(new RunnableExample("Поток 7"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
    }
}
