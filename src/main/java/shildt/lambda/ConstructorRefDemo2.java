package shildt.lambda;

// Продемонстрировать применение ссылки на конструктор обобщенного класса

@FunctionalInterface
interface MyFunc5<T> {
    MyClass4<T> func(T v);
}

class MyClass4<T> {
    private T val;

    public MyClass4(T val) {
        this.val = val;
    }

    public MyClass4() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc5<Integer> mf5 = MyClass4::new;

        MyClass4<Integer> mc4 = mf5.func(100);

        System.out.println("Значение val в объекте mc4 равно: " + mc4.getVal());
    }
}
