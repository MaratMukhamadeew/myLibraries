package learn.shildt.lambda;

// Продемонстрировать применение ссылки на метод экземпляра

@FunctionalInterface
interface StringFunc4 {
    String func(String str);
}

class MyStringOps2 {
    String strReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }
}

public class MethodRefDemo2 {
    // В этом методе функциональный интерфейс указывается в качестве типа первого эго параметра.
    // Следовательно, ему может быть передан любой экземпляр этого интерфейса, включая ссылку на метод
    static String stringOp(StringFunc4 sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";

        MyStringOps2 mso = new MyStringOps2();
        String outStr = stringOp(mso::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
