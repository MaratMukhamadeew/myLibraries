package JavaGuru.concurrent;

public class SleepExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepExample se = new SleepExample();

        Thread one = new Thread(se);
        one.setName("Fred");
        Thread two = new Thread(se);
        two.setName("Lucy");
        Thread three = new Thread(se);
        three.setName("Riki");

        one.start();
        two.start();
        three.start();
    }
}
