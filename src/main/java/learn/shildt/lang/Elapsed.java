package learn.shildt.lang;

// Измерение времени выполнения программы

public class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Измерение времени перебора от 0 до 100_000_000");
        // Измерить время перебора от 0 до 100_000_000

        start = System.nanoTime(); // Получить начальный момент
        for (int i = 0; i < 100_000_000L; i++);
        end = System.nanoTime();
        System.out.println("Время выполнения: " + (end - start));
    }
}
