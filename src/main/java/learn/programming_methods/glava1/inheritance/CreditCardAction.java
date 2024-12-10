package learn.programming_methods.glava1.inheritance;

public class CreditCardAction extends AbstractCardAction {
    // поля, конструкторы, методы
    public boolean checkCreditLimit() { // Собственный метод
        return true; // stub
    }

    @Override
    public void doPayment(double amountPayment) {
        System.out.println("Complete from debt card " + this.getClass().getName());
    }
}
