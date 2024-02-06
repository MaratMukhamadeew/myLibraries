package learn.JavaGuru.oop;

public interface Transport {
    String transportType = "ДВС";

    void move(int path);

    default void honk() {
        System.out.println("Би-бип");
    }
}
