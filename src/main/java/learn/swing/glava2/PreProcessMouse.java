package learn.swing.glava2;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PreProcessMouse extends JFrame {
    public PreProcessMouse() {
        super("Pre process mouse");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(new MouseL());
        setSize(200,200);
        setVisible(true);
    }
    public void processMouseEvent(MouseEvent e) {
        if (e.getClickCount() != 1) {
            super.processMouseEvent(e);
            // Один щелчок не пропускаем к слушателю
        }
    }
    static class MouseL extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Click count: " + e.getClickCount());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PreProcessMouse::new);
    }
}
