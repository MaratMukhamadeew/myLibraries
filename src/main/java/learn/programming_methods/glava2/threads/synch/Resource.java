package learn.programming_methods.glava2.threads.synch;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {
    private final FileWriter fileWriter;
    public Resource(String file) throws IOException {
        // Проверка наличия файла
        fileWriter = new FileWriter(file, true);
    }
    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str).append(String.valueOf(i));
            System.out.print(str + i);
            Thread.sleep((long) (Math.random() * 100));
            fileWriter.append("->").append(String.valueOf(i)).append(" ");
            System.out.print("->" + i + " ");
        } catch (IOException ex) {
            System.err.println("Ошибка файла: " + ex);
        } catch (InterruptedException ex) {
            System.err.println("Ошибка потока: " + ex);
        }
    }
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("Ошибка закрытия файла: " + ex);
        }
    }
}
