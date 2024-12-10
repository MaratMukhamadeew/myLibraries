package learn.programming_methods.glava1.scalability;

import java.util.Random;

public class TestAction {
    public AbstractQuest[] generateTest(final int NUMBER_QUEST, int maxMode) {
        AbstractQuest[] test = new AbstractQuest[NUMBER_QUEST];
        for (int i = 0; i < test.length; i++) {
            int mode = new Random().nextInt(maxMode); // stub
            // Заполнение массива объектами-вопросами
            test[i] = QuestFactory.getQuestFromFactory(mode);
        }
        return test;
    }
    public int checkTest(AbstractQuest[] test) {
        int counter = 0;
        for (AbstractQuest abstractQuest : test) {
            // Вызов полиморфного метода
            if (abstractQuest.check(new Answer())) {
                ++counter;
            }
        }
        return counter;
    }
}
