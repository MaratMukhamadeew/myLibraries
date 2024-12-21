package learn.programming_methods.glava2.collection;

public enum ItemEnum {
    ITEM_ID(true), PRICE(true), NAME(true);
    private boolean ascend;
    ItemEnum(boolean ascend) {
        this.ascend = ascend;
    }
    public boolean isAscend() {
        return ascend;
    }
    public void setAscend(boolean ascend) {
        this.ascend = ascend;
    }
}
