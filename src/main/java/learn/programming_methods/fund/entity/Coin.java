package learn.programming_methods.fund.entity;

public class Coin {
    private double diameter;
    public Coin(double diameter) {
        super();
        initDiameter(diameter);
    }
    public final void initDiameter(double value) { // Можно public final заменить private
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Отрицательный диаметр!");
        }
    }
}
