package learn.swing.glava3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConsumingEvents extends JFrame {
    public ConsumingEvents() {
        super("Consuming events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Слушатель, поглощающий печатание символов
        KeyListener kl = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
                System.out.println(e.getKeyChar());
            }
        };
        // Добавляем текстовые поля
        setLayout(new FlowLayout());
        JTextField swingField = new JTextField(10);
        swingField.addKeyListener(kl);
        add(swingField);
        TextField awtField = new TextField(10);
        add(awtField);
        awtField.addKeyListener(kl);

        JButton button = new JButton("Жмите!");
        add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                e.consume();
                System.out.println(e.getSource());
            }
        });

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ConsumingEvents::new);
    }
}
