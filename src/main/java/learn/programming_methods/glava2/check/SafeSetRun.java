package learn.programming_methods.glava2.check;

import learn.programming_methods.glava2.collection.Order;

import java.util.*;

public class SafeSetRun {
    public static void main(String[] args) {
        HashSet orders;
//        orders = new HashSet(); // заменяемы код на jdk 1.4 и ниже
        orders = (HashSet) Collections.checkedSet(new HashSet<>(), Order.class);
        orders.add(new Order(55, 33.33f));
    }
}
