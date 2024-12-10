package learn.programming_methods.glava1.shapes.action;

import learn.programming_methods.glava1.shapes.entity.Triangle;

public class TriangleAction implements IShapeAction<Triangle> {
    @Override
    public double computePerimeter(Triangle shape) {
        return shape.getA() + shape.getB() + shape.getC();
    }
    @Override
    public double computeSquare(Triangle shape) {
        return shape.getA() * shape.getB() / 2 * Math.sin(shape.getAngle());
    }
}
