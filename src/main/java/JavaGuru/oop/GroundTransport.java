package JavaGuru.oop;

public abstract class GroundTransport implements Transport {

    abstract void refuel(int litres);

    @Override
    public void honk() {
        System.out.println("Дзынь-дзынь");
    }
}
