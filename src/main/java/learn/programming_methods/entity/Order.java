package learn.programming_methods.entity;

public class Order {
    private int id;
    static int bonus;
    public final int MIN_TAX = 8 + (int)(Math.random() * 5);
    public static final int PURCHASE_TAX = 6;

    public double calculatePrice(double price, int counter) {
        double amount = (price - bonus) * counter;
        double tax = amount * PURCHASE_TAX;
        return amount + tax;
    }
}
