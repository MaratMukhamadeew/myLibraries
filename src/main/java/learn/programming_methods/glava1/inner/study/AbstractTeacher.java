package learn.programming_methods.glava1.inner.study;

public abstract class AbstractTeacher {
    private int id;
    public AbstractTeacher(int id) {
        this.id = id;
    }
    // Методы
    public abstract boolean excludeStudent (String name);
}
