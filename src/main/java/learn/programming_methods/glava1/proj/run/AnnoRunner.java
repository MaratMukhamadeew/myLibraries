package learn.programming_methods.glava1.proj.run;

import learn.programming_methods.glava1.proj.accountlogic.AccountOperationManager;
import learn.programming_methods.glava1.proj.accountlogic.AccountOperationManagerImpl;
import learn.programming_methods.glava1.proj.annotation.logic.SecurityFactory;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        // "Регистрация класса" для включения аннотации в обработку
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336, 6);
        securityAccount.withDraw(64092376, 2);
        securityAccount.convert(200);
        securityAccount.transfer(300);
    }
}
