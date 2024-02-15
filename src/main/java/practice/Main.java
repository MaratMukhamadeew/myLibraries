package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        frame.add(new MyComponent());
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 965, dimension.height / 2 - 540, 2000,1000);
        jFrame.setTitle("Hello world");
        return jFrame;
    }

    // Список всех шрифтов
    static void showAllFonts() {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String font : fonts) {
            System.out.println(font);
        }
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Font font = new Font("Arial", Font.BOLD,20);
            g2.setFont(font);
            g2.drawString("Hello world!", 50, 50);
            Point2D p1 = new Point2D.Double(0, 0);
            Point2D p2 = new Point2D.Double(260, 260);
            Line2D l1 = new Line2D.Double(p1, p2);
            g2.draw(l1);
        }
    }
}
