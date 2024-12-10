package learn.programming_methods.glava1.entity;

import java.util.Objects;
import java.util.Vector;

public class Student implements Cloneable {
    private int id;
    private String name;
    private int age;
    private Vector<Byte> v = new Vector<>();
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && age == student.age && name.equals(student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name: " + name + ", id: " + id + ", age: " + age;
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        Student copy = null;
        try {
            copy = (Student) super.clone();
            copy.v = (Vector<Byte>) v.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return copy;
    }
}
