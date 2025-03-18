package learn.javaKid.chapter5.calculator_v2;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    JPanel windowContext;
    JFormattedTextField displayField;
    JButton[] buttons = new JButton[10];
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivide;
    JButton buttonMultiply;
    JPanel p1;
    JPanel p2;
    /*
     * В конструкторе создаются все компоненты и добавляются на фрейм с помощью
     * комбинации BorderLayout и GridLayout
     * */
    Calculator() {
        windowContext = new JPanel();

        // Задаем схему для этой панели
        BorderLayout borderLayout = new BorderLayout();
        windowContext.setLayout(borderLayout);

        // Создаем и отображаем поле.
        // Добавляем его в Северную область окна
        displayField = new JFormattedTextField();
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        windowContext.add("North", displayField);

        // Создаем кнопки, использую конструктор класса JButton, который
        // принимает текст в качестве параметра
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + i);
        }
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");

        // Создаем панель с GridLayout, которая содержит
        // 12 кнопок - 10 кнопок с числами и кнопки с точкой и знаком равно
        p1 = new JPanel();
        GridLayout gridLayout1 = new GridLayout(4,3);
        p1.setLayout(gridLayout1);

        // Добавляем кнопки на панель p1
        for (int i = 1; i < buttons.length + 1; i++) {
            if (i == 10) {
                p1.add(buttons[0]);
            } else {
                p1.add(buttons[i]);
            }
        }
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        // Помещаем панель p1 в центральную область окна
        windowContext.add("Center", p1);

        // Создаем панель с GridLayout, которая содержит 4 кнопки +, -, /, *
        p2 = new JPanel();
        GridLayout gridLayout2 = new GridLayout(4,1);
        p2.setLayout(gridLayout2);

        // Добавляем кнопки на панель p2
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultiply);

        // Помещаем панель p2 в восточную область окна
        windowContext.add("East", p2);

        // Создаем фрейм и задаем его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContext);

        // Задаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        var engine = new CalculatorEngine_v2(this);
        for (JButton button : buttons) {
            button.addActionListener(engine);
        }
        buttonPoint.addActionListener(engine);
        buttonEqual.addActionListener(engine);
        buttonPlus.addActionListener(engine);
        buttonMinus.addActionListener(engine);
        buttonDivide.addActionListener(engine);
        buttonMultiply.addActionListener(engine);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        getGridBagLayout();
    }


    public static void getGridBagLayout() {
        var panel = new JPanel();

        // Задаем GridBagLayout для панели окна
        var gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);

        // Создаем экземпляр класса GridBagConstraints. Эти строки
        // кода нужно повторить для каждой компоненты, которая добавляется в ячейку
        var constraints = new GridBagConstraints();

        // Задаём ограничения для строки ввода калькулятора.
        // Координата x в таблице
        constraints.gridx = 0;

        // Координата y в таблице
        constraints.gridy = 0;

        // Эта ячейка имеет такую же высоту, как стандартные ячейки
        constraints.gridheight = 1;

        // Эта ячейка имеет ширину равную, ширине 6 стандартных ячеек
        constraints.gridwidth = 1;

        // Заполняем всё пространство ячейки
        constraints.fill = GridBagConstraints.BOTH;

        // Пропорция по горизонтали, которую будет занимать компонент
        constraints.weightx = 1.0;

        // Пропорция по вертикали, которую будет занимать компонент
        constraints.weighty = 1.0;

        // Позиция компонента внутри ячейки
        constraints.anchor = GridBagConstraints.CENTER;

        var displayField = new JTextField();

        // Устанавливаем ограничения для поля ввода
        gridBagLayout.setConstraints(displayField, constraints);

        // Добавляем поле ввода в окно
        panel.add(displayField);

        // Создаем фрейм и задаем его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(panel);

        // Задаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
    }
}
