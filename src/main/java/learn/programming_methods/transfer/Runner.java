package learn.programming_methods.transfer;

import learn.programming_methods.transfer.bean.Account;

public class Runner {
    public static void main(String[] args) {
        Account from = new Account(78031864L,258.5);
        Account to = new Account(58510009L,12.1);
        TransferAction action = new TransferAction();
        TransferAction.transactionAmount = 72.4;
        boolean complete = TransferAction.transferIntoAccount(from,to);
        if (complete) {
            System.out.println("Сумма: " + action.increaseAmount() + " переведена успешно!");
            System.out.print("На счету клиента ID = " + to.getId());
            System.out.println(" находится сумма: " + to.getAmount());
        } else {
            System.out.println("Транзакция не выполнена");
            System.out.print("На счету клиента ID = " + from.getId());
            System.out.println(" недостаточно средств!");
        }
    }
}
