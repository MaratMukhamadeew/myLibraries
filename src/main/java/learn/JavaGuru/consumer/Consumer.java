package learn.JavaGuru.consumer;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            store.get();
        }
    }
}
