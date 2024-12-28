package learn.programming_methods.glava2.threads.synchro;

import java.util.Scanner;

public class Payment {
    private int amount;
    private boolean close;

    public int getAmount() {
        return amount;
    }
    public boolean isClose() {
        return close;
    }
    public synchronized void doPayment() {
        try {
            System.out.println("Start payment:");
            while (amount <= 0) {
                this.wait(); // Остановка потока и освобождение блокировки после
                // возврата блокировки выполнение будет продолжено
            }
            // Код выполнения платежа
            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed: " + close);
    }
    public void initAmount() {
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
    }
}
