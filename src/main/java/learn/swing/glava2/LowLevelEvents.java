package learn.swing.glava2;

import javax.swing.*;
import java.awt.event.*;

public class LowLevelEvents extends JFrame {
    // Сюда мы будем выводить информацию
    private JTextArea out;

    public LowLevelEvents() {
        super("Low level events");
        // При закрытии окна - выход
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Добавим текстовое поле
        add(new JScrollPane(out = new JTextArea()));
        // и кнопку
        JButton button = new JButton("Источник событий");
        add(button, "South");
        // Регистрируем нашего слушателя
        OurListener ol = new OurListener();
        button.addKeyListener(ol);
        button.addMouseListener(ol);
        button.addMouseMotionListener(ol);
        button.addMouseWheelListener(ol);
        button.addFocusListener(ol);
        // Выводим окно на экран
        setSize(900,700);
        setVisible(true);
    }


    // Внутренний класс - слушатель событий
    class OurListener implements MouseListener, KeyListener, MouseMotionListener, MouseWheelListener, FocusListener {
        @Override
        public void focusGained(FocusEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void focusLost(FocusEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void keyTyped(KeyEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void keyPressed(KeyEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void keyReleased(KeyEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseClicked(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mousePressed(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseReleased(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseEntered(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseExited(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseDragged(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseMoved(MouseEvent e) { out.append(e.toString() + "\n"); }
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) { out.append(e.toString() + "\n"); }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LowLevelEvents::new);
    }
}
