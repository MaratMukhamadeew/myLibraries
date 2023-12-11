package JavaGuru.consumer;

public class Store {
    private int item;

    public synchronized void put() {
        while (item >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item++;
        System.out.println("Производитель добавил 1 товар. Теперь на складе: " + item);
        notify();
    }

    public synchronized void get() {
        while (item < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item--;
        System.out.println("Покупатель купил 1 товар. Теперь на складе: " + item);
        notify();
    }
}
