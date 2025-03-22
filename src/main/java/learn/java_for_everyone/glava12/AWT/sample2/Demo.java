package learn.java_for_everyone.glava12.AWT.sample2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame {
    private int count = 0;
    private String text = "Нажмите кнопку \"Число\"";

    public MyFrame(int x, int y) throws HeadlessException {
        super();
        setTitle("Окно с кнопками и меткой");
        setBounds(x,y,300,200);

        // Окно фиксированных размеров
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Отключение менеджера компоновки для окна:
        setLayout(null);
        Font font = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 13);
        setFont(font);

        // Создание панели
        Panel panel = new Panel();
        panel.setBounds(10,30,280,120);
        panel.setBackground(Color.LIGHT_GRAY);
        // Определение менеджера компоновки для панели
        panel.setLayout(new BorderLayout());

        // Создание метки
        Label label = new Label(text + count);
        label.setAlignment(Label.CENTER);
        label.setForeground(Color.BLUE);
        // Добавление метки в центр панели
        panel.add(label, BorderLayout.CENTER);
        // Добавление панели в окно
        add(panel);

        Button buttonClose = new Button("Закрыть");
        buttonClose.setBounds(40,160,90,30);
        buttonClose.addActionListener(actionEvent -> System.exit(0));
        // Добавление кнопки в окно
        add(buttonClose);

        Button buttonNumeric = new Button("Число");
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
        buttonNumeric.setBounds(170,160,90,30);
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
