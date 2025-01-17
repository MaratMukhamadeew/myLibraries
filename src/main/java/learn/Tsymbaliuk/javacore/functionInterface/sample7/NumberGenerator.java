package learn.Tsymbaliuk.javacore.functionInterface.sample7;

public class NumberGenerator {
    public Integer add(Integer n) {
        return n + 10;
    }

    public Double add(Double n) {
        return n + 20.0;
    }

    public String add(String n) {
        return n + " " + n;
    }
}
