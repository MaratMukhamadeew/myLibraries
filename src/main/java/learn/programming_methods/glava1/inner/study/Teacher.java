package learn.programming_methods.glava1.inner.study;

public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }
    // Методы

    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}
