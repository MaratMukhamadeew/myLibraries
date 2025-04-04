package learn.swing.glava2;

import learn.swing.glava2.porty.ButtonPressEvent;
import learn.swing.glava2.porty.ButtonPressListener;
import learn.swing.glava2.porty.SimpleButton;

import javax.swing.*;

// Обработка события нового компонента
public class SimpleButtonTest extends JFrame {
    public SimpleButtonTest() {
        super("Simple button test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создаем кнопку и присоединим слушателей
        SimpleButton button = new SimpleButton();
        // Анонимный класс
        button.addButtonPressListener(new ButtonPressListener() {
            @Override
            public void buttonPressed(ButtonPressEvent e) {
                System.out.println("1!");
            }
        });

        // Внутренний класс
        button.addButtonPressListener(new ButtonL());
        // Добавим кнопку в окно
        JPanel contents = new JPanel();
        contents.add(button);
        setContentPane(contents);

        setSize(400,300);
        setVisible(true);
    }
    class ButtonL implements ButtonPressListener {
        @Override
        public void buttonPressed(ButtonPressEvent e) {
            System.out.println("2!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleButtonTest::new);
    }
}
