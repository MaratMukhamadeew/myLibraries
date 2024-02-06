package learn.shildt.lang;

// Продемонстрировать применение методов totalMemory(), freeMemory(), и gc()

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someInt = new Integer[1000];

        System.out.println("Всего памяти: " + runtime.totalMemory());
        System.out.println("Свободной памяти исходно: " + runtime.freeMemory());
        runtime.gc();
        mem1 = runtime.freeMemory();
        System.out.println("Свободной памяти после очистки: " + mem1);

        for (int i = 0; i < someInt.length; i++) {
            someInt[i] = new Integer(i); // Выделить память для объектов Integer
        }
        mem2 = runtime.freeMemory();
        System.out.println("Свободной памяти после выделения: " + mem2);
        System.out.println("Использовано памяти для выделения: " + (mem1 - mem2));

        // Отбросить Integers
        for (int i = 0; i < someInt.length; i++) {
            someInt[i] = null;
        }
        runtime.gc();
        mem2 = runtime.freeMemory();
        System.out.println("Свободной памяти после очистки отвергнутых объектов типа Integer: " + mem2);
    }
}
