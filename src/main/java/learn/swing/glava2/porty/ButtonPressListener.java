package learn.swing.glava2.porty;

import java.util.EventListener;

public interface ButtonPressListener extends EventListener {
    // Данный метод будет вызываться при нажатии кнопки
    void buttonPressed(ButtonPressEvent e);
}
