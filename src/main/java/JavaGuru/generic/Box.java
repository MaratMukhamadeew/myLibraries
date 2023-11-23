package JavaGuru.generic;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<String> boxStr = new Box<>();
        boxStr.setItem("Test");

        String str = boxStr.getItem();
        System.out.println(str);

        Box<Integer> boxInt = new Box<>();
        boxInt.setItem(50);

        int i = boxInt.getItem();
        System.out.println(i);
    }
}
