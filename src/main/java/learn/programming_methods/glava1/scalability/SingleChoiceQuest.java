package learn.programming_methods.glava1.scalability;

public class SingleChoiceQuest extends AbstractQuest {
    // Поля, конструкторы и методы
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
        // Проверка корректности ответа (true или false)
        return true; // stub
    }
}
