package learn.javaKid.chapter5.calculator_v2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine_v2 implements ActionListener {
    boolean point = false;
    Calculator parent; // Ссылка на Calculator

    char selectedAction = ' '; // +, -, / или *
    double currentResult = 0;

    // Конструктор сохраняет ссылку на окно калькулятора в переменной "parent"
    public CalculatorEngine_v2(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Получить источник текущего действия
        JButton clickedButton = (JButton) e.getSource();

        // Получить текущий текст из поля вывода ("дисплея") калькулятора
        String displayFieldText = parent.displayField.getText();

        double displayValue = 0;

        // Получить число из дисплея калькулятора, если он не пустой. Восклицательный знак - это оператор отрицания

        if (!"".equals(displayFieldText)) {
            System.out.println(displayFieldText);
            displayValue = Double.parseDouble(displayFieldText);
        }

        Object src = e.getSource();

        // Для каждой кнопки арифметического действия запомнить его: +, -, / или *, сохранить текущее число
        // в переменной currentResult, очистить дисплей для ввода нового числа
        if (src.equals(parent.buttonPlus)) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonPoint) {
            if (point) {
                JOptionPane.showConfirmDialog(null, "Нельзя вводить больше одной точки",
                        "Много точек", JOptionPane.DEFAULT_OPTION);
            } else {
                String clickedButtonLabel = clickedButton.getText();
                parent.displayField.setText(displayFieldText + clickedButtonLabel);
                point = true;
            }
        } else if (src == parent.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual) {
            // Совершить арифметическое действие, в зависимости от selectedAction, обновить
            // переменную currentResult и показать результат на дисплее
            if (selectedAction == '+') {
                currentResult += displayValue;

                // Конвертировать результат в строку, добавляя его к пустой строке и показать его
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                if (displayValue == 0) {
                    JOptionPane.showConfirmDialog(null, "На ноль делить нельзя",
                            "Деление на ноль", JOptionPane.DEFAULT_OPTION);
                } else {
                    currentResult /= displayValue;
                    parent.displayField.setText("" + currentResult);
                }
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        } else {
            // Для всех цифровых кнопок присоединить надпись на кнопке к надписи в дисплее
            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(displayFieldText + clickedButtonLabel);
        }
    }
}
