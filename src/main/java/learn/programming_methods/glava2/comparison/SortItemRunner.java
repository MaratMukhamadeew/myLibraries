package learn.programming_methods.glava2.comparison;

import learn.programming_methods.glava2.collection.Item;
import learn.programming_methods.glava2.collection.ItemComparator;
import learn.programming_methods.glava2.collection.ItemEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortItemRunner {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>(Arrays.asList(
                new Item(52201, 9.75f, "T-Shirt"),
                new Item(52127, 13.99f, "Dress"),
                new Item(47063, 45.95f, "Jeans"),
                new Item(90428, 60.9f, "Gloves"),
                new Item(53295, 31f, "Shirt"),
                new Item(63220, 14.9f, "Tie")
        ));
        // Создание компаратора
        Comparator<Item> comparator = new Comparator<Item>() {
            // Сравнение для сортировки по убыванию цены товара
            @Override
            public int compare(Item one, Item two) {
                return Double.compare(two.getPrice(), one.getPrice());
            }
        };
        ItemEnum itemEnum = ItemEnum.PRICE;
//        itemEnum.setAscend(false);
        Collections.sort(list, new ItemComparator(itemEnum));
        System.out.println(list);
        list.sort(new Item.NameComparator());
        System.out.println(list);
    }
}
