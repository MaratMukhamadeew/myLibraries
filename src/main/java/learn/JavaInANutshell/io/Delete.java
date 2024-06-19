package learn.JavaInANutshell.io;

import java.io.File;

/**
 * Этот класс состоит из статического метода delete() и самостоятельной программы,
 * удаляющей заданный файл или каталог.
 */
public class Delete {
    /**
     * Это метод main() самостоятельной программы. После проверки своих аргументов
     * он вызывает метод Delete.delete() для выполнения удаления.
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\marat\\myLibraries\\src\\main\\java\\learn\\JavaInANutshell\\io\\testFrom.txt";
//        if (args.length != 1) {
//            System.err.println("Формат команды: java Delete <файл или каталог>");
//            System.exit(0);
//        }
//        // Вызывается метод delete() и отображаются выданные им сообщения об ошибках.
//        try {
//            delete(args[0]);
//        } catch (IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//        }
        delete(path);
    }

    /**
     * Статический метод, выполняющий удаление. Вызывается методом main(), но может вызываться и
     * другими программами. Первым делом, прежде чем попытаться их удалить, он убеждается, что заданные файл
     * или каталог допускают удаление. Встретив затруднение, он генерирует исключение IllegalArgumentException.
     */
    public static void delete(String fileName) {
        // Создаем объект класса File для представления имени файла
        File file = new File(fileName);

        // Убеждаемся, что файл или каталог существует и не защищен от записи
        if (!file.exists()) {
            fail("Delete: нет такого файла или каталога: " + fileName);
        }
        if (!file.canWrite()) {
            fail("Delete: защищен от записи: " + fileName);
        }

        // Если это каталог, убеждаемся, что он пуст
        if (file.isDirectory()) {
            String[] files = file.list();
            assert files != null;
            if (files.length > 0) {
                fail("Delete: каталог не пустой: " + fileName);
            }
        }

        // Если все проверки пройдены, пытаемся удалить
        boolean success = file.delete();

        // И генерируем исключение, если по какой-то (неизвестной) причине это не удалось.
        // Например, вследствие ошибки реализации java 1.1.1 под Linux удаление каталога не удастся никогда.
        if (!success) {
            fail("Delete: удаление не удалось");
        }
    }

    /** Вспомогательный метод, генерирующий исключение */
    protected static void fail(String msg) throws IllegalArgumentException {
        throw new IllegalArgumentException(msg);
    }
}
