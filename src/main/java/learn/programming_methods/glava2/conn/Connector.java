package learn.programming_methods.glava2.conn;

public class Connector {
    public static void loadResource(SameResource resource) throws IllegalArgumentException {
        if (resource == null || !resource.exists() || !resource.isCreate()) {
            throw new IllegalArgumentException(); // Генерация исключения
            // или собственное исключение, например throw new IllegalResourceException();
        }
        // more code
        System.out.println("Успешное выполнение метода loadResource(SameResource resource) {} класса Connector.");
    }
}
