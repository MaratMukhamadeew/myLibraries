package learn.java_for_everyone.glava12.AWT.sample1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoAWT {
    public static void main(String[] args) {
        // Создаем объект окна
        Frame window = new Frame("Окно Swing");

        // Размеры окна
        window.setSize(300,200);

        // Положение окна
        window.setLocation(500,400);

        // Добавление обработчика в окно
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                // Завершение выполнения
                System.exit(0);
            }
        });

        // Отображение окна
        window.setVisible(true);
    }
}
