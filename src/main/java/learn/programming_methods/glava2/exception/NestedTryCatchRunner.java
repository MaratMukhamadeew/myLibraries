package learn.programming_methods.glava2.exception;

public class NestedTryCatchRunner {
    public void doAction() {
        try { // Внешний блок
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
            try { // Внутренний блок
                int b = 1 / a;
                StringBuilder sb = new StringBuilder(b);
            } catch (NegativeArraySizeException e) {
                System.err.println("Недопустимый размер буфера: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("Деление на 0: " + e);
        }
    }
}
