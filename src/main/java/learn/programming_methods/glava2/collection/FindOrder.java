package learn.programming_methods.glava2.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindOrder {
    public static List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders) {
        ArrayList<Order> bigPrices = new ArrayList<>();
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order current = iterator.next();
            if (current.getAmount() >= bigAmount) {
                bigPrices.add(current);
            }
        }
        return bigPrices;
    }
}
