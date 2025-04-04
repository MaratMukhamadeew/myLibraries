package learn.swing.glava2;
// Внутренние классы для обработки событий
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassEvents extends JFrame {
    private JTextField text;
    private  JButton button;
    public InnerClassEvents() {
        super("Inner class events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(text = new JTextField(10));
        add(button = new JButton("Нажмите"));
        button.addActionListener(new ButtonL());
//        button.addActionListener(e -> System.out.println(text.getText()));
        pack();
        setVisible(true);
    }
    // Класс - слушатель нажатия на кнопку
    class ButtonL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(text.getText());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InnerClassEvents::new);
    }
}
