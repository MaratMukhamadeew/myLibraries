package learn.javaKid.chapter5.calculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Создаем панель
        JPanel windowContent = new JPanel();

        // Задаём менеджер отображения для этой панели
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);

//        GridLayout gr = new GridLayout(4,2,5,5);
//        windowContent.setLayout(gr);

//        BorderLayout bl = new BorderLayout();
//        windowContent.setLayout(bl);

        // Создаем компоненты в памяти
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        // Добавляем компоненты на панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        // Добавляем компоненты на панель BorderLayout
//        windowContent.add("North",label1);
//        windowContent.add("West",field1);
//        windowContent.add("East", label2);
//        windowContent.add("South", field2);
//        windowContent.add(label3);
//        windowContent.add(result);
//        windowContent.add(go);

        // Создаём фрейм и делаем для него панель
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);

        // Задаём размер и делаем фрейм видимым
        frame.setSize(400,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
