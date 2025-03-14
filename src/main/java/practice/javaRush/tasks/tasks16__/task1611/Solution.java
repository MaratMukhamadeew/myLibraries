package practice.javaRush.tasks.tasks16__.task1611;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }
    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }
        @Override
        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {

            }
        }

        private void printTikTak() throws InterruptedException {
            sleep(500);
            System.out.println("Tik");
            sleep(500);
            System.out.println("Tak");
        }
    }
}
