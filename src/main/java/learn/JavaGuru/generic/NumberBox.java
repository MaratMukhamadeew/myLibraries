package learn.JavaGuru.generic;

public class NumberBox<T extends Number> {
    private T num;

    NumberBox(T num) {
        this.num = num;
    }

    // Проверить равенство абсолютных значений двух объектов
    public boolean absEqual(NumberBox<?> obj) {
        return Math.abs(num.doubleValue()) ==
                Math.abs(obj.num.doubleValue());
    }

    public void printInt(NumberBox<? super Double> value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        NumberBox<Integer> numberBox1 = new NumberBox<>(1);
        NumberBox<Double> numberBox2 = new NumberBox<>(-1.0);

        System.out.println(numberBox1.absEqual(numberBox2));
        numberBox1.printInt(numberBox2);
    }
}
