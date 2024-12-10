package learn.programming_methods.glava1.proj.annotation.logic;

import learn.programming_methods.glava1.proj.accountlogic.AccountOperationManager;
import learn.programming_methods.glava1.proj.annotation.BankingAnnotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityFactory {
    public static AccountOperationManager createSecurityObject(AccountOperationManager targetObject) {
        return (AccountOperationManager) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new SecurityInvocationHandler(targetObject));
    }
    private static class SecurityInvocationHandler implements InvocationHandler {
        private Object targetObject = null;
        public SecurityInvocationHandler(Object targetObject) {
            this.targetObject = targetObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            SecurityLogic logic = new SecurityLogic();
            Method realMethod = targetObject.getClass().getMethod(method.getName(),
                    method.getParameterTypes());
            BankingAnnotation annotation = realMethod.getAnnotation(BankingAnnotation.class);
            if (annotation != null) {
                // Доступны и аннотации и параметры метода
                logic.onInvoke(annotation.securityLevel(), realMethod, args);
                try {
                    return method.invoke(targetObject, args);
                } catch (InvocationTargetException e) {
                    System.err.println(annotation.securityLevel());
                    throw e.getCause();
                }
            } else {
                // В случае если аннотирование метода обязательно, следует генерировать
                // исключение на факт её отсутствия
                // throw new InvocationTargetException(null, "method " + realMethod + " should be annotated");

                // В случае если допустимо отсутствие аннотации у метода
                return null;
            }
        }
    }
}
