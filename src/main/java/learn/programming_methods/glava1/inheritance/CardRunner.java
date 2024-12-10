package learn.programming_methods.glava1.inheritance;

public class CardRunner {
    public static void main(String[] args) {
        CardAction dc1 = new CardAction();
        AbstractCardAction dc2 = new CreditCardAction();
        CreditCardAction dc3 = new CreditCardAction();

        dc1.doPayment(15.5);
        dc2.doPayment(21.2);
        dc3.doPayment(7.0);

        System.out.println(dc3.checkCreditLimit());
//        dc2.checkCreditLimit();
//        ((CreditCardAction)dc1).checkCreditLimit();
        System.out.println(((CreditCardAction)dc2).checkCreditLimit());
    }
}
