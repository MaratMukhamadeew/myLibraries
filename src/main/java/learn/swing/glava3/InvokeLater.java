package learn.swing.glava3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvokeLater extends JFrame {
    private JButton button;
    public InvokeLater() {
        super("Invoke later");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("Выполнить сложную работу");
        button.addActionListener(e -> {
            // Запускаем отдельный поток
            new ComplexJobThread().start();
            button.setText("Подождите...");
        });
        setLayout(new FlowLayout());
        add(new JTextField(20));
        add(button);
        setSize(300,200);
        setVisible(true);
    }
    class ComplexJobThread extends Thread {
        @Override
        public void run() {
            try {
                // Изобразим задержку
                sleep(5000);
                // Работа закончена, нужно изменить интерфейс
                EventQueue.invokeLater(() -> button.setText("Работа завершена"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InvokeLater::new);
    }
}
