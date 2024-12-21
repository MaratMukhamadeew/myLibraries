package learn.programming_methods.glava2.collection;

public class Order implements Comparable<Order> {
    private int orderId;
    private float amount;

    public Order(int orderId, float amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public float getAmount() {
        return amount;
    }
    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.orderId, other.orderId);
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }
}
