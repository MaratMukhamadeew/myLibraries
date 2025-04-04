package learn.swing.glava2.porty;

import java.util.EventObject;

public class ButtonPressEvent extends EventObject {
    // Конструктор. Требует задать источник события
    public ButtonPressEvent(Object source) {
        super(source);
    }
}
