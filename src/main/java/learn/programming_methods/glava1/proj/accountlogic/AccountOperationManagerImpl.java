package learn.programming_methods.glava1.proj.accountlogic;

import learn.programming_methods.glava1.proj.annotation.BankingAnnotation;
import learn.programming_methods.glava1.proj.annotation.SecurityLevelEnum;

public class AccountOperationManagerImpl implements AccountOperationManager {
    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public double depositInCash(int accountNumber, int amount) {
        // Зачисление на депозит
        return 0;
    }
    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public boolean withDraw(int accountNumber, int amount) {
        // Снятие суммы, если не превышает остаток
        return true; // stub
    }
    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    public boolean convert(double amount) {
        // Конвертировать сумму
        return true; // stub
    }
    @Override
    @BankingAnnotation
    public boolean transfer(double amount) {
        // Перевести сумму на счёт
        return true; // stub
    }
}
