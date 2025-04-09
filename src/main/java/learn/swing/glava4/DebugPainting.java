package learn.swing.glava4;

import javax.swing.*;
import java.awt.*;

// Демонстрация возможностей отладки графики в Swing
public class DebugPainting extends JFrame {
    public DebugPainting() {
        super("DebugPainting");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        PaintingComponent pc = new PaintingComponent();
        add(pc);

        // Включаем для него отладку графики
        RepaintManager.currentManager(pc).setDoubleBufferingEnabled(false);
        pc.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION | DebugGraphics.FLASH_OPTION);
        DebugGraphics.setFlashTime(150);
        DebugGraphics.setFlashCount(3);

        setSize(200,200);
        setVisible(true);
    }

    // Компонент, который что-то рисует
    static class PaintingComponent extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // три простые фигуры
            g.setColor(Color.ORANGE);
            g.fillRect(10,10,100,100);

            g.setColor(Color.GREEN);
            g.drawOval(50,50,50,50);

            g.setColor(Color.BLUE);
            g.fillOval(100,20,50,50);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DebugPainting::new);
    }
}
