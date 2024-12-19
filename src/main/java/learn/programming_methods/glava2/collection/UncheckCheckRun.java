package learn.programming_methods.glava2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class UncheckCheckRun {
    public static void main(String[] args) {
        ArrayList raw = new ArrayList() { // Сырая компиляция - raw type
            { // логический блок анонимного класса
                add(new Order(231, 12.f));
                add(new Item(23154, 120.f, "Xerox"));
                add(new Order(217, 1.7f));
            }
        };
        // При извлечении требуется приведение типов
        Order or1 = (Order) raw.get(0);
        Item or2 = (Item) raw.get(1);
        Order or3 = (Order) raw.get(2);
        for (Object obj : raw) {
            System.out.println("raw " + obj);
        }
        ArrayList<Order> orders = new ArrayList<>() {
            {
                add(new Order(231,12.f));
                add(new Order(389,2.9f));
                add(new Order(217,1.7f));
//                add(new Item(23145,120.f,"Xerox"));  Ошибка компиляции: список параметризован
            }
        };
        for (Order order : orders) {
            System.out.println("Order: " + order);
        }

        ArrayList<Item> items = new ArrayList<>(Arrays.asList(new Item(1,1.1f,"qqq"), new Item(2,2.2f,"www")
                , new Item(3,3.3f,"eee")));
        for (Item item : items) {
            System.out.println("Item: " + item);
        }
    }
}
