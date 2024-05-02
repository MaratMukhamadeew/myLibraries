package learn.JavaInANutshell.classes;

import learn.JavaGuru.generic.C;

/**
 * Этот класс представляет комплексные числа и определяет методы, реализующие арифметику комплексных чисел.
 * */
public class ComplexNumber {
    private double x, y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double real() {
        return x;
    }
    public  double imaginary() {
        return y;
    }
    /**
     * Вычисляет абсолютную величину комплексного числа
     * */
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x + b.x, a.y + b.y);
    }
    public ComplexNumber add(ComplexNumber a) {
        return new ComplexNumber(this.x + a.x, this.y + a.y);
    }
    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x * b.x - a.y * b.y, a.x * b.y + a.y * b.x);
    }
    public ComplexNumber multiply(ComplexNumber a) {
        return new ComplexNumber(x * a.x - y * a.y, x * a.y + y * a.x);
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(11,12);
        ComplexNumber b = new ComplexNumber(22,23);

        System.out.println(a.real());
        System.out.println(a.imaginary());
        System.out.println(b.real());
        System.out.println(b.imaginary());

        System.out.println(a.magnitude());
        System.out.println(b.magnitude());

        System.out.println(a);
        System.out.println(b);

        System.out.println(ComplexNumber.add(a, b));
        System.out.println(a.add(b));
        System.out.println(b.add(a));

        System.out.println(ComplexNumber.multiply(a, b));
        System.out.println(a.multiply(b));
        System.out.println(b.multiply(a));

    }
}
