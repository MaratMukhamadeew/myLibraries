package learn.swing.glava4;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTPainting extends Frame {
    public AWTPainting() {
        super("AWTPainting");

        // Выход при закрытии окна
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());

        // Попробуем закрасить часть кнопки
        add(new Button("Перерисуем кнопку!") {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillRect(2,2,getWidth() - 5, getHeight() - 5);
            }
        });
        setSize(200,200);
    }
    // В этом методе производится рисование
    @Override
    public void paint(Graphics g) {
        // Заполняется всё красным цветом
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,getWidth(),getHeight());
    }

    public static void main(String[] args) {
        new AWTPainting().setVisible(true);
    }
}
