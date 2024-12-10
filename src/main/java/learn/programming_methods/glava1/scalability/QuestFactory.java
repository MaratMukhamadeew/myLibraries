package learn.programming_methods.glava1.scalability;

public class QuestFactory { // Шаблон Factory method (упрощенный)
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0 -> {
                return new DragonDropQuest();
            }
            case 1 -> {
                return new SingleChoiceQuest();
            }
            case 2 -> {
                return new MultiPlayQuest();
            }
            default -> throw new IllegalArgumentException("illegal mode");
//            assert false; // плохо
//            return null; // ещё хуже
        }
    }
}
