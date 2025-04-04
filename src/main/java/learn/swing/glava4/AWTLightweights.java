package learn.swing.glava4;
// Использование легковесных компонентов в AWT

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTLightweights extends Frame {
    public AWTLightweights() {
        super("AWTLightweights");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Добавляем пару легковесных компонентов
        LightweightRect rect1 = new LightweightRect(Color.BLUE, true);
        LightweightRect rect2 = new LightweightRect(Color.RED, true);
        LightweightRect transparentRect = new LightweightRect(Color.BLACK, false);

        // Указываем координаты вручную, чтобы компоненты перекрывались
        setLayout(null);
        rect1.setBounds(40,40,100,100);
        rect2.setBounds(50,50,100,100);
        transparentRect.setBounds(35,35,150,150);
        add(transparentRect);
        add(rect1);
        add(rect2);

        // Последним добавляем тяжеловесный компонент
        Button button = new Button("Тяжелая!");
        button.setBounds(50,225,80,30);
        add(button);

        setSize(250,250);
        setVisible(true);
    }

    // Легковесный компонент - цветной прямоугольник
    static class LightweightRect extends Component {
        private final Color color;
        private final boolean fill;

        public LightweightRect(Color color, boolean fill) {
            this.color = color;
            this.fill = fill;
        }
        @Override
        public void paint(Graphics g) {
            g.setColor(color);
            if (fill) g.fillRect(0,0,getWidth() - 1,getHeight() - 1);  // g.fillRect - закрашивает полностью
            else g.drawRect(0,0,getWidth() - 1,getHeight() - 1);       // g.drawRect - рисует рамку
        }
    }

    public static void main(String[] args) {
        new AWTLightweights();
    }
}
