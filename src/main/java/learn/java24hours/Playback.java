package learn.java24hours;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
    public Playback() throws HeadlessException {
        super("Playback");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        JPanel panel = new JPanel();
        setLayout(flo);

        JButton play = new JButton("Воспроизведение");
        JButton stop = new JButton("Остановить");
        JButton pause = new JButton("Пауза");
        JLabel pageLabel = new JLabel("Адрес веб-страницы: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField(20);
        JCheckBox jumboSize = new JCheckBox("Jumbo Size", true);
        JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
        JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
        JCheckBox enumNuggets = new JCheckBox("Emu Nuggets", false);
        JTextArea comments = new JTextArea("У меня есть пара\nмодных кожаных перчаток.",8,40);

        comments.setLineWrap(true);

        ButtonGroup meals = new ButtonGroup();
        meals.add(jumboSize);
        meals.add(frogLegs);
        meals.add(fishTacos);
        meals.add(enumNuggets);

        JComboBox<String> profession = new JComboBox<>();
        profession.addItem("Мясник");
        profession.addItem("Пекарь");
        profession.addItem("Изготовитель подсвечников");
        profession.addItem("Лучник");
        profession.addItem("Боксер");
        profession.addItem("Разработчик документации");

        JScrollPane scroll = new JScrollPane(comments, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

//        add(panel);
        add(play);
        add(stop);
        add(pause);
        add(pageLabel);
        add(pageAddress);
        add(jumboSize);
        add(frogLegs);
        add(fishTacos);
        add(enumNuggets);
        setVisible(true);
        add(profession);
        add(scroll);

    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.metal.MetalLookAndFeel"
            );
        } catch (Exception e) {
            // Игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        Playback frame = new Playback();
    }
}
