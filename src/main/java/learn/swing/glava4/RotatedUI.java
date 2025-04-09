package learn.swing.glava4;

import javax.swing.*;
import java.awt.*;

// Кручение и верчение стандартных компонентов
public class RotatedUI extends JFrame {
    public RotatedUI() {
        super("RotatedUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Добавляем особую панель
        RotatingPanel rp = new RotatingPanel();
        add(rp);

        // Добавляем в панель компоненты
        rp.add(new JButton("Привет!"));
        rp.add(new JTextField(20));

        // Устанавливаем свой RepaintManager
        RepaintManager.setCurrentManager(new RotatingRepaintManager());

        setSize(300,300);
        setVisible(true);
    }

    // Компонент, который поворачивает всех потомков
    static class RotatingPanel extends JPanel {
        // Отвечает за прорисовку потомков
        @Override
        protected void paintChildren(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.translate(50,200);

            // Поворот на 45 градусов
            g2.rotate(-Math.PI / 4);

            // Небольшое растяжение
            g2.shear(-0.1,-0.1);

            // Обычное рисование предков
            super.paintChildren(g);
        }
    }

    // Особый тип RepaintManager
    static class RotatingRepaintManager extends RepaintManager {
        // Все запросы на перерисовку попадают сюда
        public void addDirtyRegion(JComponent c, int x, int y, int w, int h) {
            // Ищем нужного предка
            Container parent = c;
            while (! (parent instanceof RotatingPanel)) {
                parent = parent.getParent();
                if (parent == null) {
                    // Мы не нашли нашего предка, сброс
                    parent = c;
                    break;
                }
            }
            // Перерисовываем весь компонент полностью
            super.addDirtyRegion((JComponent) parent, 0,0, parent.getWidth(), parent.getHeight());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RotatedUI::new);
    }
}
