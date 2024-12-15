package learn.programming_methods.glava2.conn;

public class Runner {
    public static void main(String[] args) {
        SameResource resource = new SameResource();
//        SameResource resource = null;
        try { // Необязателен только при гарантированной корректности значения параметра
            Connector.loadResource(resource);
        } catch (IllegalArgumentException e) {
            System.err.println("Обработка unchecked-исключения вне метода: " + e);
        }
    }
}
