package learn.programming_methods.glava2.collection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            // Загрузка пар ключ-значение через поток ввода-вывода
            props.load(new FileReader("src" + File.separator + "main" + File.separator + "resources"
                    + File.separator + "property" + File.separator + "database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("db.driver");
        // Следующих двух ключей в файле нет
        String maxIdle = props.getProperty("db.maxIdle"); // Будет присвоен null
        // Значение "20" будет присвоено ключу, если он будет найден в файле
        String maxActive = props.getProperty("db.maxActive", "20");
        System.out.println(driver);
        System.out.println(maxIdle);
        System.out.println(maxActive);
    }
}
