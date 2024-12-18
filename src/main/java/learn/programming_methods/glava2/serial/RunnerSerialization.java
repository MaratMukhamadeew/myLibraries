package learn.programming_methods.glava2.serial;

import java.io.InvalidObjectException;

public class RunnerSerialization {
    public static void main(String[] args) {
        // Создание и запись объекта
        Student student = new Student("MMF", "Goncharenko", 1, "G017s9");
        System.out.println(student);
        String path = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\data_files\\demo.txt";
        Serializator serializator = new Serializator();
        boolean b = serializator.serialization(student, path);
        Student.faculty = "GEO"; // Изменение значения static-поля
        // Чтение и вывод объекта
        Student result = null;
        try {
            result = serializator.deserialization(path);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
