package learn.shildt.lambda;

// Блочное выражение, изменяющее на обратный порядок следование символов в строке

interface StringFunc {
    String func(String str);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();

            for (int i = str.length() -1; i >= 0 ; i--)
                result.append(str.charAt(i));

            return result.toString();
        };
        System.out.println("Лямбда обращается на: " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на: " + reverse.func("Выражение"));
    }
}
