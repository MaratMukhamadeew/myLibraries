package learn.programming_methods.glava1.proj.accountlogic;

public interface AccountBaseAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    void unblocking();
}
