package learn.JavaGuru.oop;

public class BusTest {
    public static void main(String[] args) {
        GroundTransport bus = new Bus();
        bus.honk();
        bus.refuel(50);
        bus.move(150);

        Object busObj = new Bus();
        ((GroundTransport) busObj).honk();
        ((GroundTransport) busObj).refuel(50);
        ((GroundTransport) busObj).move(150);

        System.out.println(bus);
    }
}
