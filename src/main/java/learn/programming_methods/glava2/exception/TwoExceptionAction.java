package learn.programming_methods.glava2.exception;

public class TwoExceptionAction {
    public void doAction() {
        try {
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int[] c = { 1 / a };// Опасное место №1
            c[a] = 71; // Опасное место №2
        } catch (ArithmeticException e) {
            System.err.println("Деление на 0 " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bounds: " + e);
        } // Окончание try-catch блока
        System.out.println("after try-catch");
    }
}
