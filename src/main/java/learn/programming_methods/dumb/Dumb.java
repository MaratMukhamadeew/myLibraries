package learn.programming_methods.dumb;

public class Dumb {
    { this.id = 6; }
    int id;
    public Dumb() {
        System.out.println("Конструктор класса Dumb ");
        // Вызов потенциально полиморфного метода - плохо
        id = this.getId();
        System.out.println(" id = " + id);
    }
    int getId() {
        System.out.println("getId() класса Dumb ");
        return id;
    }
}
