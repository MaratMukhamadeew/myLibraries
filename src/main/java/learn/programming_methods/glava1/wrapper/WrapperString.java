package learn.programming_methods.glava1.wrapper;

public class WrapperString {
    private String str;
    public WrapperString() {
        str = new String();
    }
    public WrapperString(String s) {
        str = new String(s);
    }
    public int indexOf(int arg) { // Делегированный метод
        // Новая функциональность
        return arg;
    }
}
