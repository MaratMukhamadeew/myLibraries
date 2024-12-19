package learn.programming_methods.glava2.collect;

import java.util.ArrayList;

public class DemoGeneric {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        ArrayList<int> ints = new ArrayList<int>();  Ошибка компиляции
        list.add("Java"); // Компилятор "знает" допустимый тип передаваемого значения
        list.add("JavaFX 2");
        String res = list.get(0); // Компилятор "знает" допустимый тип возвращаемого значения
//        list.add(new StringBuilder("C#")); Ошибка компиляции. Компилятор не позволит добавить "посторонний" тип
        System.out.println(list); // Удобный вывод
    }
}
