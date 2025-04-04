package learn.swing.glava2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Анонимные классы для обработки событий
public class AnonymousClassEvents extends JFrame {
    public AnonymousClassEvents() {
        super("Anonymous class events");
        // Анонимный класс присоединяется прямо на месте
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // Добавим кнопку
        JButton button = new JButton("Нажмите меня");
        getContentPane().add(button);
        // Слушатель создается в методе
        button.addActionListener(getButtonL());
        pack();
        setVisible(true);
    }
    // Этот метод создает слушателя для кнопки
    public ActionListener getButtonL() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionListener");
            }
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnonymousClassEvents::new);
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new AnonymousClassEvents();
//            }
//        });
    }
}
