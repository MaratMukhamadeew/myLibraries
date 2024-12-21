package learn.programming_methods.glava2.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class OrderQueueAction {
    public static void main(String[] args) {
//        LinkedList<Order> orders = new LinkedList<>(Arrays.asList(
//                new Order(231, 12.f),
//                new Order(389, 2.9f),
//                new Order(217, 1.7f)
//        ));
        LinkedList<Order> orders = new LinkedList<>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        Queue<Order> queue = orders;
        queue.offer(new Order(222, 9.7f));
        orderProcessing(orders);
        if (queue.isEmpty()) {
            System.out.println("Queue of Orders is empty");
        }
    }

    public static void orderProcessing(Queue<Order> orders) { // Заменить void -> boolean
        Order order;
        // Заменить while -> do{} while
//        while ((order = orders.poll()) != null) { // Извлечение с удалением
//            System.out.println("Order #" + order.getOrderId() + " is processing");
//        }
        do {
            order = orders.remove();
            System.out.println("Order #" + order.getOrderId() + " is processing");
        } while (!orders.isEmpty());
    }
}
