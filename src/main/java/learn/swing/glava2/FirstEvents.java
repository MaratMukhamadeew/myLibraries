package learn.swing.glava2;

import javax.swing.*;
import java.awt.event.*;

// События - нажатия клавиш на клавиатуре
public class FirstEvents extends JFrame {
    public FirstEvents() {
        super("First Events");

        // При закрытии окна - выход
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Регистрируем нашего слушателя
        addKeyListener(new KeyL());
        addMouseListener(new MouseL());
//        addMouseMotionListener(new MouseMotionL());
        addMouseWheelListener(new MouseWheelL());
        addFocusListener(new FocusEventL());

        // Выводим на экран
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        new FirstEvents();
//                    }
//                }
                FirstEvents::new
        );
    }
}

// Этот класс будет получать извещения о событиях
class KeyL implements KeyListener {
    // Печать символа
    @Override
    public void keyTyped(KeyEvent k) {
        System.out.println(k);
    }

    // Нажатие клавиши
    @Override
    public void keyPressed(KeyEvent k) {
        System.out.println(k);
    }

    // Отпускание нажатой клавиши
    @Override
    public void keyReleased(KeyEvent k) {
        System.out.println(k);
    }
}

class MouseL implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mouseClicked(MouseEvent e)");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mousePressed(MouseEvent e)");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mouseReleased(MouseEvent e)");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mouseEntered(MouseEvent e)");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mouseExited(MouseEvent e)");
    }
}

class MouseMotionL implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mouseDragged(MouseEvent e)");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e);
        System.out.println("public void mouseMoved(MouseEvent e)");
    }
}
class MouseWheelL implements MouseWheelListener {
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e);
        System.out.println("public void mouseWheelMoved(MouseEvent e)");
    }
}
class FocusEventL implements FocusListener {
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println(e);
        System.out.println("public void focusGained(MouseEvent e)");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println(e);
        System.out.println("public void focusLost(MouseEvent e)");
    }
}