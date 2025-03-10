package learn.programming_methods.glava2.threads.market;

public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500; // in millis

    public Broker(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
