package learn.programming_methods.glava2.threads.market;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicDemo {
    private static final int NUMBERS_BROKERS = 30;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < NUMBERS_BROKERS; i++) {
            new Broker(market).start();
        }
    }
}
