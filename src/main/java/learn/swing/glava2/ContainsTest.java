package learn.swing.glava2;

import javax.swing.*;
import java.awt.*;

// Изменение поведения мыши и метод contains()
public class ContainsTest extends JFrame {
    public ContainsTest() {
        super("Contains test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Невидимка") {
            @Override
            public boolean contains(int x, int y) {
                // Не содержим ни одной кнопки
                return false;
            }
        };

        setLayout(new FlowLayout());
        add(button);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ContainsTest::new);
    }
}
