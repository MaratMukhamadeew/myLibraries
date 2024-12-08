package learn.programming_methods.transfer;

import learn.programming_methods.transfer.bean.Account;

public class TransferAction {
    public static double transactionAmount;
    private int id;

    public static boolean transferIntoAccount(Account from, Account to) {
        // Определение остатка
        double demand = from.getAmount() - transactionAmount;
        // Проверка остатка и перевода суммы
        if (demand >= 0) {
            from.setAmount(demand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double increaseAmount() {
        return transactionAmount++;
    }
}
