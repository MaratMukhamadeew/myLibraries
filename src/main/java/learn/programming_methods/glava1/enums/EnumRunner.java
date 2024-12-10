package learn.programming_methods.glava1.enums;

public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (Shape shape : Shape.values()) {
            shape.setShape(3, i--);
            System.out.println(shape + " площадь = " + shape.computeSquare());
        }
        System.out.println();
        int a = 4;
        for (Shape shape : Shape.values()) {
            System.out.println(shape + " площадь = " + shape.defineSquare(3, a--));
        }
    }
}
