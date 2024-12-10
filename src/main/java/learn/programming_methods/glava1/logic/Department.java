package learn.programming_methods.glava1.logic;

public class Department {
    {
        System.out.println("logic (1) id = " + this.id);
    }
    static {
        System.out.println("static logic");
    }
    private int id = 7;
    public Department(int id) {
        this.id = id;
        System.out.println("Конструктор id = " + id);
    }

    public int getId() {
        return id;
    }
    { // Не очень хорошее расположение логического блока
        System.out.println("logic (2) id = " + id);
    }
}
