package learn.JavaInANutshell.basics;
/**
 * Эта программа вычисляет и отображает факториал числа, заданного в командной строке.
 * При помощи оператора try/catch в ней обрабатываются возможные ошибки пользовательского ввода.
 * */
public class FactComputer {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(x + " != " + Factorial3.factorial(x));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы должны задать аргумент");
            System.out.println("Формат: java FactComputer <число>");
        } catch (NumberFormatException e) {
            System.out.println("Задаваемый аргумент должен быть целым числом");
        } catch (IllegalArgumentException e) {
            System.out.println("Плохой аргумент: " + e.getMessage());
        }
    }
}
