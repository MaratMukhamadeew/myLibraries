package shildt.lambda;

// Передать лямбда-выражение в качестве аргумента методу

interface StringFunc2 {
    String func(String str);
}

public class LambdasAsArgumentsDemo {
    static String stringOp (StringFunc2 sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp(String::toUpperCase, inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        outStr = stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result.append(str.charAt(i));
                return result.toString();
        }, inStr);
        System.out.println("Это строка с удаленными пробелами: " + outStr);

        outStr = stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) result.append(str.charAt(i));
            return result.toString();
        }, inStr);
        System.out.println("Это обращенная строка: " + outStr);
    }
}
