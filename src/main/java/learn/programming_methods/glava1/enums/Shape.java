package learn.programming_methods.glava1.enums;

public enum Shape {
    RECTANGLE, SQUARE, CIRCLE {
        // анонимный класс
        public double computeSquare() { // Версия для CIRCLE
            return Math.pow(getA(), 2) * Math.PI;
        }
    }
    , TRIANGLE { // анонимный класс
        public double computeSquare() { // Версия для TRIANGLE
            return this.getA() * this.getB() / 2;
        }
    };
    private double a;
    private double b;
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void setShape(double a, double b) {
        if ((a <= 0 || b <= 0) || a != b && this == SQUARE) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
    }
    public double computeSquare() { //Версия для RECTANGLE и SQUARE
        return a * b;
    }
    @Override
    public String toString() {
        return name() + " -> a = " + a + ", b = " + b;
    }
    // Метод класса перечисления
    public double defineSquare(double... x) {
        // Проверка параметров
        switch (this) {
            case RECTANGLE, SQUARE -> {
                return x[0] * x[1];
            }
            case TRIANGLE -> {
                return (x[0] * x[1]) / 2;
            }
            case CIRCLE -> {
                return Math.pow(x[0], 2) * Math.PI;
            }
            default -> throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }
}
