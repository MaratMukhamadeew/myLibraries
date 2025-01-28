package learn.Tsymbaliuk.javacore.lambdaFunction.sample1;

public class Main {
    public static void main(String[] args) {
//        StringModificator sm = text -> text.toUpperCase();
        StringModificator sm = String::toUpperCase;
        System.out.println(sm.getString("hello"));

        StringModificator sm2 = text -> {
            String result = "";
            for (char let : text.toCharArray()) {
                if (Character.isLetter(let) || let == ' ') {
                    result += let;
                }
            }
            return result;
        };

        System.out.println(sm2.getString("hello23 .,/624$#gsa"));
    }
}
