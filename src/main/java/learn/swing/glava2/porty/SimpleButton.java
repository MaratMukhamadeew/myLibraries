package learn.swing.glava2.porty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

// Пример компонента со своим собственным событием
public class SimpleButton extends JComponent {
    // Список слушателей
    private ArrayList<ButtonPressListener> listenerList = new ArrayList<>();

    // Один объект - событие на все случаи жизни
    private ButtonPressEvent event = new ButtonPressEvent(this);

    // Конструктор - присоединяет к кнопке слушателя
    // событий от мыши
    public SimpleButton() {
        addMouseListener(new PressL());
        // Зададим размеры компонента
        setPreferredSize(new Dimension(100,50));
    }

    // Присоединяет слушателя нажатия кнопки
    public void addButtonPressListener(ButtonPressListener listener) {
        listenerList.add(listener);
    }

    // Отсоединяет слушателя нажатия кнопки
    public void addRemovePressListener(ButtonPressListener listener) {
        listenerList.remove(listener);
    }

    // Прорисовываем кнопку
    public void paintComponent(Graphics g) {
        // Зальем зеленым цветом
        g.setColor(Color.GREEN);
        g.fillRect(0,0,getWidth(),getHeight());
        // Рамка
        g.setColor(Color.black);
        g.draw3DRect(0,0,getWidth(),getHeight(),true);
    }

    // Оповещает слушателей о событии
    protected void fireButtonPressed() {
        for (ButtonPressListener listener : listenerList) {
            listener.buttonPressed(event);
        }
    }

    // Внутренний класс, следит за нажатием мыши
    class PressL extends MouseAdapter {
        // Нажатие мыши в области кнопки
        @Override
        public void mousePressed(MouseEvent e) {
            // Оповестим слушателей
            fireButtonPressed();
        }
    }
}
