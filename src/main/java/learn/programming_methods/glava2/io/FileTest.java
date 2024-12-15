package learn.programming_methods.glava2.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) {
        // С объектом типа File ассоциируется файл на диске FileTest2.java
        File fp = new File("C:\\Users\\marat\\myLibraries\\src\\main\\java\\learn\\programming_methods\\glava2" +
                "\\io\\FileTest2.java");
        if (fp.exists()) {
            System.out.println(fp.getName() + " существует");
            if (fp.isFile()) { // Если объект - дисковый файл
                System.out.println("Путь к файлу:\t" + fp.getPath());
                System.out.println("Абсолютный путь:\t" + fp.getAbsolutePath());
                System.out.println("Размер файла:\t" + fp.length());
                System.out.println("Последняя модификация:\t" + new Date(fp.lastModified()));
                System.out.println("Файл доступен для чтения:\t" + fp.canRead());
                System.out.println("Файл доступен для записи:\t" + fp.canWrite());
                System.out.println("Файл удалён:\t" + fp.delete());
            }
        } else {
            System.out.println("Файл " + fp.getName() + " не существует");
        }
        try {
            if (fp.createNewFile()) {
                System.out.println("Файл " + fp.getName() + " создан");
            }
        } catch (IOException e) {
            System.err.println("Ошибка IO: " + e);
        }
        // В объект типа File помещается каталог\директория
        // в корне проекта должен быть создан каталог com.learn с несколькими файлами
        File dir = new File("C:" + File.separator + "Users" + File.separator + "marat" + File.separator + "myLibraries"
                + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "txt_files" + File.separator
                + "learn");
        if (dir.exists() && dir.isDirectory()) { // Если объект является каталогом и существует
            System.out.println("Каталог " + dir.getName() + " существует");
        } else System.out.println("Каталог " + dir.getName() + " не существует");
        File[] files = dir.listFiles();
        assert files != null;
        for (File file : files) {
            Date date = new Date(file.lastModified());
            System.out.print("\n" + file.getPath() + "\t| " + file.length() + "\t| " + date);
            // Использовать toLocaleString() или toGMTString()
        }
        // Метод listRoots() возвращает доступные корневые каталоги
        File root = File.listRoots()[1];
        System.out.printf("\n%s %,d из %,d свободно.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());

    }
}
