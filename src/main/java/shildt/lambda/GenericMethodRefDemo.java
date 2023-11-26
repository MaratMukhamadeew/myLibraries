package shildt.lambda;

// Продемонстрировать применение ссылки на обобщенный метод, объявленный в необобщенном классе

@FunctionalInterface
interface MyFunc3<T> {
    int func(T[] vals, T v);
}

// В этом классе определяется метод countMatching(), возвращающий количество элементов в массиве, равных
// указанному значению. Обратите внимание на то, сто метод countMatching() является
//  обобщенным, тогда как класс MyArrayOps - необобщенным
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (T val : vals)
            if (val == v)
                count++;

            return count;
    }
}

public class GenericMethodRefDemo {
    // В качестве первого параметра этого метода указывается функциональный интерфейс MyFunc3, а в качестве
    // двух других параметров - массив и значение, причем оба типа T
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] strs = { "Один", "Два", "Три", "Два" };
        int count;

        count = myOp(MyArrayOps::countMatching, vals,4);
        System.out.println("Массив vals содержит " + count + " совпадения числа 4");
        count = myOp(MyArrayOps::countMatching, strs,"Два");
        System.out.println("Массив strs содержит " + count + " совпадений числа Два");

    }
}
