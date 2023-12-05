package Tsymbaliuk.innerClasses.sample1;

public class MathFunction {
    private class Square extends Function {
        @Override
        public int function(int i) {
            return i * i;
        }
    }

    private class Cube extends Function {
        @Override
        public int function(int i) {
            return i * i * i;
        }
    }

    public Function getSquare() {
        return new Square();
    }

    public Function getCube() {
        return new Cube();
    }
}
