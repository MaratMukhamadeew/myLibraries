package learn.Tsymbaliuk.javacore.innerClasses.sample1;

public class Main2 {
    public static void main(String[] args) {
        MathFunction mf = new MathFunction();

        System.out.println(calculate(mf.getSquare(), 1,4));
        System.out.println(calculate(mf.getCube(), 1,4));
    }

    public static int calculate(Function fun, int begin, int end) {
        return fun.calculate(begin, end);
    }
}
