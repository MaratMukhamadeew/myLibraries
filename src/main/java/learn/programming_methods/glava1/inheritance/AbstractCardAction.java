package learn.programming_methods.glava1.inheritance;

public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction() { // Конструктор
    }
    public boolean checkLimit() {
        return true; // stub
    }
    public abstract void doPayment(double amount);
}
