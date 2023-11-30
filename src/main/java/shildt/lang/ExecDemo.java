package shildt.lang;

// Продемонстрировать применение метода exec()

public class ExecDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec("Notepad");
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }
    }
}
