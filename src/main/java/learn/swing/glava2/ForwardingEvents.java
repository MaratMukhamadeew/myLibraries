package learn.swing.glava2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Техника диспетчеризации событий
public class ForwardingEvents extends JFrame {
    JButton button1, button2, button3;
    public ForwardingEvents() {
        super("Forwarding events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());

        button1 = new JButton("OK");
        button2 = new JButton("Отмена");
        button3 = new JButton("Прикол");
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);

        // Будем следить за нажатиями кнопок
        Forwarder forwarder = new Forwarder();
        button1.addActionListener(forwarder);
        button2.addActionListener(forwarder);
        button3.addActionListener(forwarder);

        pack();
        setVisible(true);
    }
    // Класс - слушатель нажатия на кнопку
    class Forwarder implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) onOK(e);
            if (e.getSource() == button2) onCancel(e);
            if (e.getSource() == button3) onFunny(e);
        }
    }
    // Обработка события от кнопки "OK"
    public void onOK(ActionEvent e) {
        System.out.println("onOK()");
    }
    // Обработка события от кнопки "Отмена"
    public void onCancel(ActionEvent e) {
        System.out.println("onCancel()");
    }
    // Обработка события от кнопки "Прикол"
    public void onFunny(ActionEvent e) {
        System.out.println("onFunny()");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ForwardingEvents::new);
    }
}
