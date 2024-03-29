package learn.JavaGuru.concurrent2;

public class DeadLock {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void bow(Friend bower) {
            System.out.printf("%s: %s has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s has bowed to me!%n", this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");
        new Thread(() -> {
            System.out.println("Thread 1");
            alphonse.bow(gaston);
            System.out.println("Th: Gaston bowed to Alphonse");
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2");
            gaston.bow(alphonse);
            System.out.println("2.Gaston waiting bowed");
        }).start();
    }
}
