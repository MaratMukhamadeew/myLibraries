package learn.java_for_everyone.glava12.swing.sample1;

import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame(String name) {
        super(name);
        // Размеры окна
        setSize(300,200);
        // Положение окна
        setLocation(500,400);
        // Добавление обработчика в окно
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Отображение окна
        setVisible(true);
    }
}
public class Demo {
    public static void main(String[] args) {
        // Создание и отображение окна:
        new MyFrame("Окно Swing");
    }
}
