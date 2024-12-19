package learn.programming_methods.glava2.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class RunIterator {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>(Arrays.asList(
                new Order(231, 12.f),
                new Order(389, 2.9f),
                new Order(217, 1.7f)
        ));
        System.out.println(FindOrder.findBiggerAmountOrder(10f, orders));
    }
}
