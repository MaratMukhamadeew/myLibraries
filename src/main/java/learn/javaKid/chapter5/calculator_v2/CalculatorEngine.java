package learn.javaKid.chapter5.calculator_v2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        JTextField myDisplayField = null;
        JButton clickedButton = null;

        Object eventSource = e.getSource();

        // Получаем источник события
        if (eventSource instanceof JButton) {
            clickedButton = (JButton) eventSource;
        } else if (eventSource instanceof JTextField) {
            myDisplayField = (JTextField) eventSource;
        }

        // Получаем надпись на кнопке
        assert clickedButton != null;
        String clickedButtonLabel = clickedButton.getText();

        // Добавляем надпись на кнопке к тексту окна сообщения
        JOptionPane.showConfirmDialog(null, "Your pressed " + clickedButtonLabel,
                "Just a test", JOptionPane.DEFAULT_OPTION);
    }
}
