package learn.programming_methods.glava2.threads.synchro;

public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        // вызов synchronized метода
        new Thread(payment::doPayment).start();
        Thread.sleep(200);

        synchronized (payment) { // 1-ый блок
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notify();
        }

        synchronized (payment) { // 2-ой блок
            payment.wait(1_000);
            System.out.println("OK");
        }
    }
}
