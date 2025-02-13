package practice.javaRush.tasks.tasks16__.task1612;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Ivanov", 4);
        Runner petrov = new Runner("Petrov", 2);
        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }
    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException e) {

            }
        }
        private void doStep() throws InterruptedException {
            stepNumber++;
            sleep(1000 / owner.getSpeed());
            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }
        public String getName() {
            return name;
        }
        public int getSpeed() {
            return speed;
        }
        public void start() {
            stopwatch.start();
        }
    }
}
