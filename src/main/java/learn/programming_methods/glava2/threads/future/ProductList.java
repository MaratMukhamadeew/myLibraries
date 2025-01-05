package learn.programming_methods.glava2.threads.future;

import java.util.ArrayDeque;

public class ProductList {
    private static final ArrayDeque<String> arr = new ArrayDeque<>() {
        {
            add("Product 1");
            add("Product 2");
            add("Product 3");
            add("Product 4");
            add("Product 5");
        }
    };
    public static String getProduct() {
        return arr.poll();
    }
}
