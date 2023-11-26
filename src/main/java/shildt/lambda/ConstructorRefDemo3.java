package shildt.lambda;

// Реализовать простую фабрику классов, используя ссылку на конструктор

@FunctionalInterface
interface MyFunc6<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClass5<T> {
    private T val;

    public MyClass5(T val) {
        this.val = val;
    }

    public MyClass5() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}

// Простой необобщенный класс
class MyClass6 {
    String str;

    public MyClass6(String str) {
        this.str = str;
    }

    public MyClass6() {
        str = "";
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов. У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа T. А параметр типа R обозначает тип создаваемого объекта
    static <R,T> R myClassFactory(MyFunc6<R,T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass5. В данном случае оператор new обращается
        // к конструктору, принимающему аргумент
        MyFunc6<MyClass5<Integer>, Integer> myClassCons = MyClass5::new;
        MyClass5<Integer> mcd = myClassFactory(myClassCons, 55);
        System.out.println("Значение val в объекте mcd равно: " + mcd.getVal());

        // А теперь создать экземпляр другого класса, используя метод myClassFactory()
        MyFunc6<MyClass6, String> mcStr = MyClass6::new;
        MyClass6 myClass6 = myClassFactory(mcStr,"Лямбда");
        System.out.println("Значение str в объекте myClass6 равно: " + myClass6.getStr());
    }
}
