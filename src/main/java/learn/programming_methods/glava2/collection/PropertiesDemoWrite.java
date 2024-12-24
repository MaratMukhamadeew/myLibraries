package learn.programming_methods.glava2.collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoWrite {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            // Установка значений экземпляру
            props.setProperty("db.driver", "com.mysql.jdbc.Driver");
            props.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
            props.setProperty("db.user", "root");
            props.setProperty("db.password", "pass");
            props.setProperty("db.poolsize", "5");

            // Запись property-файла в папку prop проекта
            props.store(new FileWriter("src" + File.separator + "main" + File.separator + "resources"
                    + File.separator + "property" + File.separator + "database.properties"), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
