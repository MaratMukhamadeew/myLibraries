package learn.shildt.lambda;

// Использовать ссылку на метод, чтобы найти максимальное значение в коллекции

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record MyClass(int val) {

    public int getVal() {
        return val;
    }
}

public class UseMethodRef {
    // Метод compare(), совместимый с аналогичным методом, определенным в интерфейсе Comparator<T>
    static int compareMC(MyClass mc1, MyClass mc2) {
        return Integer.compare(mc1.getVal(), mc2.getVal());
    }

    public static void main(String[] args) {
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass(1));
        list.add(new MyClass(4));
        list.add(new MyClass(2));
        list.add(new MyClass(9));
        list.add(new MyClass(3));
        list.add(new MyClass(7));

        // Найти максимальное значение, использую метод compareMC()
        MyClass maxVal = Collections.max(list, UseMethodRef::compareMC);

        System.out.println("Максимальное значение равно: " + maxVal.getVal());
    }
}
