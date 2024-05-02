package learn.java24hours;

import javax.swing.*;
import java.awt.*;

public class Crisis extends JFrame {
    JButton panicButton;
    JButton donPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    public Crisis() {
        super("Crisis");
        setLookAndFeel();
        setSize(696, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        panicButton = new JButton("Тревога");
        donPanicButton = new JButton("Не паникуйте");
        blameButton = new JButton("Виноваты другие");
        mediaButton = new JButton("Известные СМИ");
        saveButton = new JButton("Спасите себя");
        
        add(panicButton);
        add(donPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
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
        Crisis crisis = new Crisis();
    }
}
