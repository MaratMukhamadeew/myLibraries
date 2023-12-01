package shildt.lang;

//Продемонстрировать применение групп потоков исполнения

class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start(); // Запустить поток исполнения
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Исключение в " + getName());
        }
        System.out.println(getName() + " завершается.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа А");
        ThreadGroup groupB = new ThreadGroup("Группа В");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\nВывод из метода list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается Группа А");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); // Получить потоки исполнения из группы

        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).mySuspend(); // Приостановить каждый поток исполнения
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван.");
        }

        System.out.println("Возобновление Группы А");

        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).myResume(); // Возобновить все потоки исполнения в группе
        }

        // Ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков исполнения.");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (InterruptedException e) {
            System.out.println("Исключение в главном потоке исполнения");
        }
        System.out.println("Главный поток исполнения завершен.");
    }
}
