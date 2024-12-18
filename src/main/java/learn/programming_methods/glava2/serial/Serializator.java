package learn.programming_methods.glava2.serial;

import java.io.*;

public class Serializator {
    public boolean serialization(Student student, String fileName) {
        boolean flag = false;
        File file = new File(fileName);
        ObjectOutputStream oos = null;
        try(FileOutputStream fos = new FileOutputStream(file)) {
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(student); // Сериализация
                flag = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не может быть создан: " + e);
        } catch (NotSerializableException e) {
            System.err.println("Класс не поддерживает сериализацию: " + e);
        } catch (IOException e) {
            System.err.println("Общая I/O ошибка: " + e);
        }
        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException {
        File file = new File(fileName);
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Де сериализация
            return  (Student) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.err.println("Класс не существует : " + e);
        } catch (FileNotFoundException e) {
            System.err.println("Файл для де сериализации не существует: " + e);
        } catch (InvalidClassException e) {
            System.err.println("Несовпадение версий классов: " + e);
        } catch (IOException e) {
            System.err.println("Общая I/O ошибка: " + e);
        }
        throw new InvalidObjectException("Объект не восстановлен");
    }
}
