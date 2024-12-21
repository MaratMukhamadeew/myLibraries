package learn.programming_methods.glava2.collection;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {
    private ItemEnum index;
    public ItemComparator(ItemEnum index) {
        this.index = index;
    }
    public final void setSortingIndex(ItemEnum index) {
        if (index == null) {
            throw new IllegalArgumentException();
        }
        this.index = index;
    }
    public ItemEnum getIndex() {
        return index;
    }
    @Override
    public int compare(Item one, Item two) {
        switch (index) {
            case ITEM_ID -> {
                if (index.isAscend()) {
                    return Integer.compare(one.getItemId(), two.getItemId());
                } else {
                    return Integer.compare(two.getItemId(), one.getItemId());
                }
            }
            case PRICE -> {
                if (index.isAscend()) {
                    return Double.compare(one.getPrice(), two.getPrice());
                } else {
                    return Double.compare(two.getPrice(), one.getPrice());
                }
            }
            case NAME -> {
                return one.getName().compareTo(two.getName());
            }
            default -> {
                throw new EnumConstantNotPresentException(ItemEnum.class, index.name());
            }
        }
    }
}
