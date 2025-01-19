package practice.javaRush.tasks.tasks14__.task1421;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        super();
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
