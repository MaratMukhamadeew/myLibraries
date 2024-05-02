package learn.java24hours;

import javax.swing.*;
import java.awt.*;

public class SolutionFrame extends JFrame {
    public SolutionFrame() throws HeadlessException {
        super("Solution mondo!");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.metal.MetalLookAndFeel"
            );
        } catch (Exception e) {
            // Игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        SolutionFrame frame = new SolutionFrame();
    }
}
