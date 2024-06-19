package learn.JavaInANutshell.io;

import java.io.*;

/**
 * Этот класс является самостоятельной программой для копирования файлов и определяет
 * также статический метод copy(), который могут использовать для копирования файлов.
 */
public class FileCopy {
    public static void main(String[] args) {
        String pathFrom = "C:\\Users\\marat\\myLibraries\\src\\main\\java\\learn\\JavaInANutshell\\io\\testFrom.txt";
        String pathTo = "C:\\Users\\marat\\myLibraries\\src\\main\\java\\learn\\JavaInANutshell\\io\\testTo.txt";

        try {
            copy(pathFrom, pathTo);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
//        if (args.length != 2) {
//            System.err.println("Формат: java FileCopy <исходный файл> <конечный файл>");
//        } else {
//            // Вызывается метод copy() для осуществления копирования;
//            // отображаются все сообщения об ошибках
//            try {
//                copy(args[0], args[1]);
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }
    }

    /**
     * Статический метод, фактически производящий копирование файла. Для копирования файла, однако,
     * он совершает множество проверок, чтобы убедиться, что все обстоит надлежащим образом.
     */
    public static void copy(String fromName, String toName) throws IOException {
        File fromFile = new File(fromName);
        File toFile = new File(toName);

        // Сначала убеждаемся, что исходный файл существует, является файлом и доступен для чтения.
        if (!fromFile.exists()) {
            abort("Нет такого исходного файла: " + fromName);
        }
        if (!fromFile.isFile()) {
            abort("Невозможно копирование каталога: " + fromName);
        }
        if (!fromFile.canRead()) {
            abort("Исходный файл недоступен для чтения: " + fromName);
        }

        // Если заданный "конечный файл" - это каталог, в качестве имени конечного файла
        // используется имя исходного файла
        if (toFile.isDirectory()) {
            toFile = new File(toFile, fromFile.getName());
        }

        // Если файл с заданным именем конечного файла существует, убеждаемся, что он доступен для
        // записи, и, прежде чем его перезаписывать, запрашиваем подтверждение пользователя. Если
        // конечный файл не существует, убеждаемся, что такой каталог существует и доступен для записи.
        if (toFile.exists()) {
            if (!toFile.canWrite()) {
                abort("Конечный файл недоступен для записи: " + toName);
            }

            // Спрашиваем, следует ли перезаписать существующий файл
            System.out.print("Перезаписать существующий файл " + toFile.getName() + "? (Y/N): ");
            System.out.flush();

            // Получаем ответ пользователя
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String response = in.readLine();

            // Проверяем ответ пользователя. Если это не Yes, копирование отменяется.
            if (!response.equals("Y") && !response.equals("y")) {
                abort("Существующий файл не был перезаписан.");
            }
        } else {
            // Если файла с указанным именем нет, проверяем, существует ли каталог с таким именем
            // и доступен ли он для записи. Если getParent() возвращает null, каталогом будет текущий dir.,
            // для определения того, что это каталог, применяется системное свойство user.dir.
            String parent = toFile.getParent();
            if (parent == null) {
                parent = System.getProperty("user.dir");
            }
            File dir = new File(parent);
            if (!dir.exists()) {
                abort("Каталог назначения не существует: " + parent);
            }
            if (!dir.isFile()) {
                abort("Каталог назначения не является каталогом: " + parent);
            }
            if (!dir.canWrite()) {
                abort("Каталог назначения не доступен для записи: " + parent);
            }
        }

        // Копируем файл, за один прием перемещая буфер байтов.
        try (FileInputStream fis = new FileInputStream(fromFile);
             FileOutputStream fos = new FileOutputStream(toFile)) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            // В буфер считывается порция байтов, затем они выводятся, цикл исполняется, пока мы не достигнем конца
            // файла (пока read() не возвратит -1). Обратите внимание на сочетание присваивания и сравнения в цикле
            // while. Это обычная конструкция при программировании ввода/вывода.
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    /** Вспомогательный метод, генерирующий исключения */
    private static void abort(String msg) throws IOException {
        throw new IOException("FileCopy: " + msg);
    }
}
