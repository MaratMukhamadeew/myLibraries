package learn.programming_methods.glava1.shapes;

import learn.programming_methods.glava1.shapes.action.IShapeAction;
import learn.programming_methods.glava1.shapes.action.RectangleAction;
import learn.programming_methods.glava1.shapes.action.TriangleAction;
import learn.programming_methods.glava1.shapes.entity.Rectangle;
import learn.programming_methods.glava1.shapes.entity.Triangle;

import static java.lang.Math.PI;
public class ActionMain {
    public static void main(String[] args) {
        IShapeAction<Rectangle> action1;
        IShapeAction<Triangle> action2;
        try {
            Rectangle rectShape = new Rectangle(2,3);
            action1 = new RectangleAction();
            System.out.println("Площадь прямоугольника: " + action1.computeSquare(rectShape));
            System.out.println("Периметр прямоугольника: " + action1.computePerimeter(rectShape));

            Triangle trShape = new Triangle(3, 4, PI / 6);
            action2 = new TriangleAction();
            System.out.printf("Площадь треугольника: %.2f\n", action2.computeSquare(trShape));
            System.out.printf("Периметр треугольника: %.2f", action2.computePerimeter(trShape));
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
