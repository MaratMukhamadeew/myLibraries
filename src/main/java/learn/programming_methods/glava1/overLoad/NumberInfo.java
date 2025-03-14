package learn.programming_methods.glava1.overLoad;

public class NumberInfo {
    public static void viewNum(Integer i) { // 1
        System.out.printf("Integer = %d%n", i);
    }
    public static void viewNum(int i) { // 2
        System.out.printf("int = %d%n", i);
    }
    public static void viewNum(Float f) { // 3
        System.out.printf("Float = %.4f%n", f);
    }
    public static void viewNum(float f) { // 3
        System.out.printf("float = %.4f%n", f);
    }
    public static void viewNum(double f) { // 5
        System.out.printf("double = %.4f%n", f);
    }
    public static void viewNum(Number n) { // 4
        System.out.println("Number = " + n);
    }

    public static void main(String[] args) {
        Number[] num = {new Integer(7), 71, 3.14f, 7.2};
        for (Number n : num) {
            viewNum(n);
        }
        viewNum(new Integer(8));
        viewNum(81);
        viewNum(4.14f);
        viewNum(new Float(5.15));
        viewNum(8.2);
    }
}
