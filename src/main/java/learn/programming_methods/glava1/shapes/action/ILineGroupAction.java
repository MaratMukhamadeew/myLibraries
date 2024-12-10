package learn.programming_methods.glava1.shapes.action;

import learn.programming_methods.glava1.shapes.entity.AbstractShape;

public interface ILineGroupAction<T extends AbstractShape> {
    double computePerimeter(T shape);
}
