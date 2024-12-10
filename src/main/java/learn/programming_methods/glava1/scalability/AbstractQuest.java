package learn.programming_methods.glava1.scalability;

public abstract class AbstractQuest {
    private long id;
    private String questContent;
    // Конструкторы и методы
    public abstract boolean check(Answer ans);
}
