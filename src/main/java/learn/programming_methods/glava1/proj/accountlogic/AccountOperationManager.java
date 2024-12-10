package learn.programming_methods.glava1.proj.accountlogic;

public interface AccountOperationManager {
    double depositInCash(int accountNumber, int amount);
    boolean withDraw (int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(double amount);
}
