package learn.programming_methods.glava1.proj.annotation.logic;

import learn.programming_methods.glava1.proj.annotation.SecurityLevelEnum;
import java.lang.reflect.Method;

public class SecurityLogic {
    public void onInvoke(SecurityLevelEnum level, Method method, Object[] args) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : args) {
            sb.append(obj.toString()).append(" :");
        }
        sb.setLength(sb.length() - 1);
        System.out.printf("Method %S was invoked with parameters : %s%n", method.getName(), sb);

        switch (level) {
            case LOW -> System.out.println("Низкий уровень проверки безопасности: " + level);
            case NORMAL -> System.out.println("Обычный уровень проверки безопасности: " + level);
            case HIGH -> System.out.println("Высокий уровень проверки безопасности: " + level);
        }
    }
}
