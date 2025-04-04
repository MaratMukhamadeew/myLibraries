package learn.swing.glava2;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Использование адаптеров вместо интерфейсов
public class Adapters extends JFrame {
    public Adapters() {
        super("Adapters");
        // При закрытии окна - выход
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Регистрируем слушателя
        addMouseListener(new MouseL());
        setSize(200,200);
        setVisible(true);
    }
    // Наследуем от адаптера
    class MouseL extends MouseAdapter {
        // Следим за щелчками мыши в окне
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Adapters::new);
    }
}
