package learn.shildt.lambda;

// Продемонстрировать ссылку на статический метод

@FunctionalInterface
interface StringFunc3 {
    String func(String str);
}

class MyStringOps {
    static String strRevers(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }
}

public class MethodRefDemo {
    // В этом методе функциональный интерфейс указывается в качестве типа первого эго параметра.
    // Следовательно, ему может быть передан любой экземпляр этого интерфейса, включая ссылку на метод
    static String stringOp(StringFunc3 sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";

        String outStr = stringOp(MyStringOps::strRevers, inStr);

        String out = stringOp(str -> {
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1; i >= 0 ; i--)
                sb.append(str.charAt(i));
            return sb.toString();
        }, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
        System.out.println("Обращенная строка: " + out);
    }
}
