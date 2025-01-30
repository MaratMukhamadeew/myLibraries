package practice.javaRush.tasks.tasks15__.task1522;

public class Earth implements Planet {
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
