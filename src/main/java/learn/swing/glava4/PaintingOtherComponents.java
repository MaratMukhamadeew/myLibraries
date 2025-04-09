package learn.swing.glava4;
// Прорисовка других компонентов как изображений
import javax.swing.*;
import java.awt.*;

public class PaintingOtherComponents extends JFrame {
    public PaintingOtherComponents() {
        super("PaintingOtherComponents");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new CustomPaintComponent());
        setSize(400,300);
        setVisible(true);
    }

    static class CustomPaintComponent extends JPanel {
        // кнопка для рисования
        private final JButton button = new JButton("Привет!");

        // Метод для рисования в Swing
        @Override
        protected void paintComponent(Graphics g) {
            // Необходимо вызвать для обработки свойства opaque
            super.paintComponent(g);

            // Рисуем кнопки
            Graphics2D g2 = (Graphics2D) g;
            button.setSize(80,30);

            // Отключение двойной буферизации - не всегда нужно
            button.setDoubleBuffered(false);

            // Переместим позицию рисования
            g2.translate(100,100);
            for (int i = 1; i <= 8; i++) {
                // Кручение кнопки
                g2.rotate(2 * Math.PI / i);
                button.paint(g);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaintingOtherComponents::new);
    }
}
