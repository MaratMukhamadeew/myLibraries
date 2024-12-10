package learn.programming_methods.glava1.shapes.action;

import learn.programming_methods.glava1.shapes.entity.Rectangle;

public class RectangleAction implements IShapeAction<Rectangle> {
    @Override // Реализация метода из интерфейса
    public double computePerimeter(Rectangle shape) { // Периметр прямоугольника
        return 2 * (shape.getA() + shape.getB());
    }
    @Override // Реализация метода из интерфейса
    public double computeSquare(Rectangle shape) { // Площадь прямоугольника
        return shape.getA() * shape.getB();
    }
}
