package learn.swing.glava3;

import javax.swing.*;
import java.awt.*;

// Маскирование событий
public class MaskingEvents extends JFrame {
    public MaskingEvents() {
        super("Masking events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отключаем события от окна
        disableEvents(AWTEvent.WINDOW_EVENT_MASK);

        // Добавим особую кнопку
        JPanel contents = new JPanel();
        contents.add(new CustomButton("Привет!"));
        setContentPane(contents);

        setSize(400,300);
        setVisible(true);
    }

    // Особая кнопка
    static class CustomButton extends JButton {
        public CustomButton(String label) {
            super(label);
            // Отключаем события с клавиатуры и от мыши
            disableEvents(AWTEvent.KEY_EVENT_MASK);
            disableEvents(AWTEvent.MOUSE_EVENT_MASK);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MaskingEvents::new);
    }
}
