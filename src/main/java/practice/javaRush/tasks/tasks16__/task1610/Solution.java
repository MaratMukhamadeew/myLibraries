package practice.javaRush.tasks.tasks16__.task1610;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }
    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }
        @Override
        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            investigateWorld();
        }
    }
}
