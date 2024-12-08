package learn.programming_methods.creator;

import learn.programming_methods.point.Point2D;
import learn.programming_methods.point.Point3D;

public class BuildRunner {
    public static void main(String[] args) {
        Point2DCreator br = new Point3DCreator();
        Point3D p1 = (Point3D) br.createPoint();
        Point2D p = br.createPoint(); // "раннее связывание"
        System.out.println(br.createPoint().getX());
        System.out.println(br.createPoint().getY());
//        System.out.println(br.createPoint().getZ());
        System.out.println(br.createPoint().getClass());
    }
}
