package learn.Tsymbaliuk.javacore.functionInterface.sample4;

public class Main {
    public static void main(String[] args) {
        SimpleGen sg = new SimpleGen(5);

        Generator gen1 = sg::getNumber;

        int temp = gen1.getNextElement();
        System.out.println(temp);

        temp = gen1.getNextElement();
        System.out.println(temp);

        gen1 = SimpleGen::getRandomNumber;

        temp = gen1.getNextElement();

        System.out.println(temp);
    }
}
