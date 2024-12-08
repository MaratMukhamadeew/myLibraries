package learn.programming_methods.exam;

public class Exam<T extends Number> {
    private String name;
    private T mark; // Параметр поля

    public Exam(T mark, String name) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }
    private int roundMark() {
        return Math.round(mark.floatValue()); // Метод класса Number
    }

    public boolean equalsToMark(Exam<?> ob) {
        return roundMark() == ob.roundMark();
    }
}
