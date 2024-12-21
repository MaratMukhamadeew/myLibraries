package learn.programming_methods.glava2.collection;

import java.util.Comparator;

public class Item {
    private int itemId;
    private float price;
    private String name;
    public Item(int itemId, float price, String name) {
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }
    public int getItemId() {
        return itemId;
    }
    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public static class IdComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return Integer.compare(one.itemId, two.itemId);
        }
    }
    public static class PriceComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return Double.compare(one.price, two.price);
        }
    }
    public static class NameComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return one.name.compareTo(two.name);
        }
    }
    @Override
    public String toString() {
        return "\nItem: itemId = " + itemId + ", price=" + price + ", name='" + name;
    }
}
