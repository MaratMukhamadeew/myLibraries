package learn.programming_methods.glava1.proj.accountlogic;

public interface AccountAction {
    // По умолчанию все методы public и abstract
    boolean openAccount(); // Объявление сигнатуры метода
    boolean closeAccount();
    void blocking();
    void unblocking();
    double depositInCash(int accountNumber, int amount);
    boolean withDraw (int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(double amount);
}
