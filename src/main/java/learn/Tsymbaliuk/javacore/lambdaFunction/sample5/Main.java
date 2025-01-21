package learn.Tsymbaliuk.javacore.lambdaFunction.sample5;

public class Main {
    public static void main(String[] args) {
//        Modificator<String> modStr = (text) -> text.toUpperCase();
        Modificator<String> modStr = String::toUpperCase;
        System.out.println(modStr.modification("hello"));

        Modificator<Integer> modInt = (in) -> in * 25;
        System.out.println(modInt.modification(5));
    }
}
