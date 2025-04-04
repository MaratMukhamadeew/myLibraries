package learn.swing.glava3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

// Использование очереди событий
public class UsingEventQueue extends JFrame {
    public UsingEventQueue() {
        super("Using event queue");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button = new JButton("Генерировать событие");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getToolkit().getSystemEventQueue().postEvent(
                        new WindowEvent(UsingEventQueue.this, WindowEvent.WINDOW_CLOSING));
            }
        });
        // Добавляем кнопку в панель содержимого
        setLayout(new FlowLayout());
        add(button);
        setSize(400,300);
//        setVisible(true);
        show();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UsingEventQueue::new);
    }
}
