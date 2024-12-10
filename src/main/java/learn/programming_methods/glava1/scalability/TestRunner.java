package learn.programming_methods.glava1.scalability;

public class TestRunner {
    public static void main(String[] args) {
        TestAction testAction = new TestAction();
        AbstractQuest[] test = testAction.generateTest(60, 3); // 60 вопросов 3-х видов
        // Здесь должен быть код процесса прохождения теста ...
        System.out.println(testAction.checkTest(test)); // Проверка теста
    }
}
