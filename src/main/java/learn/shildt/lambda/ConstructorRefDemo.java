package learn.shildt.lambda;

// Продемонстрировать применение ссылки на конструктор

@FunctionalInterface
interface MyFunc4 {
    MyClass2 func(int n);
}

class MyClass2 {
    private int val;

    public MyClass2(int val) {
        this.val = val;
    }

    public MyClass2() {
        val = 0;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass2. Метод func() из интерфейса MyFunc4 принимает аргумент,
        // поэтому оператор new обращается к параметризованному конструктору класса MyClass2, а не к его конструктору по умолчанию
        MyFunc4 mf = MyClass2::new;

        // Создать экземпляр класса MyClass2 по ссылке на его конструктор
        MyClass2 mc = mf.func(100);

        System.out.println("Значение val в объекте mc равно: " + mc.getVal());
    }
}
