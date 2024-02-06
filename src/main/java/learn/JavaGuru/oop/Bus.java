package learn.JavaGuru.oop;

public class Bus extends GroundTransport {
    private String model = "ВАЗ";
    private String honk = "Уйди с дороги";

    @Override
    void refuel(int litres) {
        System.out.println("Заправился на " + litres + " литров");
    }

    @Override
    public void move(int path) {
        System.out.println("Проехал " + path + " километров");
    }

    @Override
    public void honk() {
        super.honk();
        System.out.println(honk);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", honk='" + honk + '\'' +
                '}';
    }
}
