package learn.programming_methods.fund.entity;

import learn.programming_methods.fund.exceptions.CoinLogicException;

public class Coin {
    private double diameter;
    private double weight;
    public Coin(double diameter) throws CoinLogicException {
        super();
        initDiameter(diameter);
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) throws CoinLogicException {
        if (diameter <= 0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        this.diameter = diameter;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public final void initDiameter(double value) throws CoinLogicException { // Можно public final заменить private
        if (value > 0) {
            diameter = value;
        } else {
            throw new CoinLogicException("diameter is incorrect");
        }
    }
}
