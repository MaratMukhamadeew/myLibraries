package learn.Tsymbaliuk.javacore.functionInterface.sample4;

public class SimpleGen {
    private int number;

    public SimpleGen(int number) {
        super();
        this.number = number;
    }

    public SimpleGen() {
        super();
    }

    public int getNumber() {
        int temp = number;
        number += 1;
        return temp;
    }
    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
