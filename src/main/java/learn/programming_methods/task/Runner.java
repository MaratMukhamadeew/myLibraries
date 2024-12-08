package learn.programming_methods.task;

import learn.programming_methods.task.action.Multiplicator;
import learn.programming_methods.task.creator.MatrixCreator;
import learn.programming_methods.task.entity.Matrix;
import learn.programming_methods.task.exceptions.MatrixException;

public class Runner {
    public static void main(String[] args) {
        try {
            Matrix p = new Matrix(2, 3);
            MatrixCreator.fillRandomizer(p, 2, 8);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            MatrixCreator.fillRandomizer(q, 2, 7);
            System.out.println("Matrix second is: " + q);
            Multiplicator mult = new Multiplicator();
            System.out.println("Matrices product is: " + mult.multiply(p, q));
        } catch (MatrixException e) {
            System.err.println("Error of creating matrix " + e);
        }
    }
}
