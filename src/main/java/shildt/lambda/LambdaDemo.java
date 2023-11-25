package shildt.lambda;

// Функциональный интерфейс
interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // Объявить ссылку на функциональный интерфейс

        myNum = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNum.getValue());

        // А здесь используется более сложное выражение
        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Случайное значение: " + myNum.getValue());

       // myNum = () -> "123.45";

        // Анонимный класс
        myNum = new MyNumber() {
            @Override
            public double getValue() {
                return 234.56;
            }
        };
        System.out.println(myNum.getValue());
    }
}
