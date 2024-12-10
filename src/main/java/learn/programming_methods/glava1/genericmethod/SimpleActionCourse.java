package learn.programming_methods.glava1.genericmethod;

import learn.programming_methods.glava1.Course;

public class SimpleActionCourse {
    public <T1 extends Course> SimpleActionCourse(T1 course) {
        // Реализация конструктора
    }
    public <T2> SimpleActionCourse() {
        // Реализация конструктора
    }
    public <T3 extends Course> float calculateMark(T3 course) {
        // Реализация метода
        return 3.14f;
    }
    public <T4> boolean printReport(T4 course) {
        // Реализация метода
        return true;
    }
    public <T5> void check() {
        // Реализация метода
    }
}
