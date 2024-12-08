package learn.programming_methods.dumb;

public class Dumber extends Dumb {
    int id = 9; // Получится два поля с одинаковыми именами
    public Dumber() {
        System.out.println("Конструктор класса Dumber ");
        id = this.getId();
        System.out.println(" id = " + id);
    }

    @Override
    int getId() {
        System.out.println("getId() класса Dumber ");
        return id;
    }
}
