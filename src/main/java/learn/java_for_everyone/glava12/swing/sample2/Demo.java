package learn.java_for_everyone.glava12.swing.sample2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    private int count = 0;
    private String text = "Нажмите кнопку \"Число\"";

    public MyFrame(int x, int y) {
        super();
        setTitle("Окно с кнопками и меткой");
        setBounds(x,y,300,210);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отключение менеджера компоновки для окна:
        setLayout(null);
        Font font = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 13);

        // Создание панели
        JPanel panel = new JPanel();
        panel.setBounds(10,10,275,120);
        panel.setBackground(Color.LIGHT_GRAY);
        // Определение менеджера компоновки для панели
        panel.setLayout(new BorderLayout());

        // Создание метки
        JLabel label = new JLabel(text + count);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(font);
        // Добавление метки в центр панели
        panel.add(label, BorderLayout.CENTER);
        // Добавление панели в окно
        add(panel);

        JButton buttonClose = new JButton("Закрыть");
        buttonClose.setBounds(30,135,100,30);
        buttonClose.setFont(font);
        buttonClose.addActionListener(actionEvent -> System.exit(0));
        // Добавление кнопки в окно
        add(buttonClose);

        JButton buttonNumeric = new JButton("Число");
        buttonNumeric.setFont(font);
        buttonNumeric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (count > 3) {
                    buttonNumeric.setEnabled(false);
                    label.setText("Кнопка \"Число\" заблокирована");
                } else {
                    label.setText(text + count);
                }
            }
        });
        buttonNumeric.setBounds(170,135,100,30);
        // Добавление кнопки в окно
        add(buttonNumeric);
        setVisible(true);
    }
}
public class Demo {
    public static void main(String[] args) {
        new MyFrame(400,300);
    }
}
