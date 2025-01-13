package practice.javaRush.task1529;

public class Plane implements CanFly {
    private int numberOfPassengers;

    public Plane(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void fly() {
        System.out.println("Plane");
    }
}
