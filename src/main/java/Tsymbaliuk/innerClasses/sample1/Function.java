package Tsymbaliuk.innerClasses.sample1;

public abstract class Function {
    public abstract int function(int i);

    public int calculate(int begin, int end) {
        return function(end) - function(begin);
    }
}
