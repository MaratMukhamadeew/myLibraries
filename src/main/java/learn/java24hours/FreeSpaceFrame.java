package learn.java24hours;

import javax.swing.*;
import java.awt.*;

public class FreeSpaceFrame extends JFrame {
    public FreeSpaceFrame() throws HeadlessException {
        super("Свободное пространство на диске");
        setLookAndFeel();
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel panel = new FreeSpacePanel();
        add(panel);
        setVisible(true);
        }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            // Игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        FreeSpaceFrame frame = new FreeSpaceFrame();
    }
}

