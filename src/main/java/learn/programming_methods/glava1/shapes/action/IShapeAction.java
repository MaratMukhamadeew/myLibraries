package learn.programming_methods.glava1.shapes.action;

import learn.programming_methods.glava1.shapes.entity.AbstractShape;

public interface IShapeAction<T extends AbstractShape> {
    double computeSquare(T shape);
    double computePerimeter(T shape);
}
