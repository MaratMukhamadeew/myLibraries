package shildt.lang;

// Продемонстрировать применение метода clone()

public class TestClone implements Cloneable {
    int a;
    double b;
    // В этом методе вызывается метод clone() из класса Object
    TestClone cloneTest() {
        try {
            // Вызвать метод clone() из класса Object
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование невозможно");
            return this;
        }
    }
    @Override
    public Object clone() {
        try {
            // Вызвать clone() из класса Object
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование невозможно");
            return this;
        }
    }
}

class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        TestClone x3;
        x1.a = 10;
        x1.b = 20.98;
        x2 = x1.cloneTest();
        x3 = (TestClone) x1.clone();
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
        System.out.println("x3: " + x3.a + " " + x3.b);
    }
}
