package learn.java_for_everyone.glava12.AWT.sample3;

import java.awt.*;
import java.awt.event.*;

public class PlotFrame extends Frame {
    public PlotFrame(int h, int w) throws HeadlessException {
        // Название окна
        setTitle("График функции");
        // Положение и размеры окна:
        setBounds(100,50,w,h);
        // Цвет фона окна:
        setBackground(Color.GRAY);
        // Отключение менеджера компоновки:
        setLayout(null);
        // Объект шрифта:
        Font font = new Font("Arial", Font.BOLD, 11);
        // Применение шрифта:
        setFont(font);
        // Окно фиксированных размеров:
        setResizable(false);
        // Пиктограмма для окна:
        setIconImage(
                getToolkit().getImage("")
        );
        // Создание панели с кнопками:
        ButtonPanel buttonPanel = new ButtonPanel(6,25,w / 4,h - 30);
        // Добавление панели в окно:
        add(buttonPanel);
        // Создание панели для отображения графика:
        PlotPanel pltPnl = new PlotPanel(
                w / 4 + 10, 25, 3 * w / 4 - 15, h - 120, buttonPanel
        );
        // Добавление панели в окно:
        add(pltPnl);
        // Панель для отображения справки:
        HelpPanel hlpPnl = new HelpPanel(
                w/4 + 10, h - 90, 3 * w/4 - 15, 85
        );
        // Добавление панели в окно:
        add(hlpPnl);
        // Регистрация обработчика для окна:
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Завершение выполнения программы:
                System.exit(0);
            }
        });
        // Регистрация обработчика для первой кнопки:
        buttonPanel.button1.addActionListener(
                new ButtonOneHandler(buttonPanel, pltPnl)
        );
        buttonPanel.button2.addActionListener(new ButtonTwoHandler());
        // Регистрация обработчика для опции отображения сетки:
        buttonPanel.checkboxes[3].addItemListener(
                new CheckboxHandler(buttonPanel)
        );
        // Отображение окна:
        setVisible(true);
    }
}
// Класс панели с кнопками:
class ButtonPanel extends Panel {
    // Массив меток:
    public Label[] labels;
    // Группа переключателей:
    public CheckboxGroup checkboxGroup;
    // Массив переключателей:
    public Checkbox[] checkboxes;
    // Раскрывающийся список:
    public Choice choice;
    // Текстовое поле:
    public TextField textField;
    // Кнопки:
    public Button button1, button2;
    // Конструктор (аргументы - координаты и размеры панели):
    ButtonPanel(int x, int y, int w, int h) {
        // Отключение менеджера компоновки:
        setLayout(null);
        // Положение и размер панели:
        setBounds(x,y,w,h);
        // Цвет фона панели:
        setBackground(Color.LIGHT_GRAY);
        // Создание массива меток:
        labels = new Label[3];
        // Первая текстовая метка:
        labels[0] = new Label("Выбор цвета:", Label.CENTER);
        // Шрифт для текстовой метки:
        labels[0].setFont(new Font("Arial", Font.BOLD,12));
        // Размеры метки:
        labels[0].setBounds(5,5,getWidth() - 10, 30);
        // Добавление метки на панель:
        add(labels[0]);
        // Создание группы переключателей:
        checkboxGroup = new CheckboxGroup();
        // Создание массива переключателей:
        checkboxes = new Checkbox[4];
        // Создание переключателей:
        checkboxes[0] = new Checkbox(" красный ", checkboxGroup,true);
        checkboxes[1] = new Checkbox(" синий ", checkboxGroup,false);
        checkboxes[2] = new Checkbox(" черный ", checkboxGroup,false);
        // Создание опции отображения сетки:
        checkboxes[3] = new Checkbox(" Сетка ", true);
        // Задаем размеры и добавляем переключатели и опцию на панель:
        for (int i = 0; i < 4; i++) {
            checkboxes[i].setBounds(5,30 + i * 25,getWidth() - 10, 30);
            add(checkboxes[i]);
        }
        // Раскрывающийся список для определения цвета линий сетки:
        choice = new Choice();
        // Добавление элементов в список:
        choice.add("Зеленый");
        choice.add("Желтый");
        choice.add("Серый");
        // Размеры и положение раскрывающегося списка:
        choice.setBounds(20,140,getWidth() - 25, 30);
        // Добавляем список на панель:
        add(choice);
        // Вторая текстовая метка:
        labels[1] = new Label("Интервал по x:", Label.CENTER);
        // Шрифт для текстовой метки:
        labels[1].setFont(new Font("Arial", Font.BOLD,12));
        // Размеры метки:
        labels[1].setBounds(5,220,getWidth() - 10, 30);
        // Добавление метки на панель:
        add(labels[1]);
        // Третья текстовая метка:
        labels[2] = new Label("От x=0 до x=", Label.LEFT);
//        // Шрифт для текстовой метки:
//        labels[1].setFont(new Font("Arial", Font.BOLD,12));
        // Размеры метки:
        labels[2].setBounds(5,250,70, 20);
        // Добавление метки на панель:
        add(labels[2]);
        // Текстовое поле для ввода верхней границы диапазона изменения аргумента функции:
        textField = new TextField("10");
        // Размеры и положение поля:
        textField.setBounds(75,250,45,20);
        // Добавление поля на панель:
        add(textField);
        // Первая кнопка ("Нарисовать"):
        button1 = new Button("Нарисовать");
        // Вторая кнопка ("Закрыть"):
        button2 = new Button("Закрыть");
        // Размеры и положение первой кнопки:
        button1.setBounds(5,getHeight() - 75, getWidth() - 10,30);
        // Размеры и положение второй кнопки:
        button2.setBounds(5,getHeight() - 35, getWidth() - 10,30);
        // Добавление первой кнопки:
        add(button1);
        // Добавление второй кнопки:
        add(button2);
    }
}
// Класс панели для отображения графика:
class PlotPanel extends Panel {
    // Ссылка на объект внутреннего класса:
    public Plotter plotter;
    // Внутренний класс для реализации графика функции:
    class Plotter {
        // Границы диапазона изменения координат:
        private double xMin = 0, xMax, yMin = 0, yMax = 1.0;
        // Состояние опции отображения сетки:
        private boolean status;
        // Цвет для отображения графика:
        private Color color;
        // Цвет для отображения линий сетки:
        private Color gColor;
        // Конструктор (аргумент - ссылка на панель с кнопками):
        Plotter(ButtonPanel buttonPanel) {
            // Считывание значения текстового поля и преобразование в число:
            try {
                xMax = Double.parseDouble(buttonPanel.textField.getText());
            } catch (NumberFormatException e) {
                buttonPanel.textField.setText("10");
                xMax = 10;
            }
            // Определение состояния опции:
            status = buttonPanel.checkboxes[3].getState();
            // Определение цвета линий сетки:
            switch (buttonPanel.choice.getSelectedIndex()) {
                case 0 -> gColor = Color.GREEN;
                case 1 -> gColor = Color.YELLOW;
                default -> gColor = Color.GRAY;
            }
            // Цвет линии графика:
            String name = buttonPanel.checkboxGroup.getSelectedCheckbox().getLabel();
            if (name.equalsIgnoreCase(" красный ")) {
                color = Color.RED;
            } else {
                if (name.equalsIgnoreCase(" синий ")) {
                    color = Color.BLUE;
                } else {
                    color = Color.BLACK;
                }
            }
        }
        // Метод определяет отображаемую на графике функцию:
        private double f(double x) {
            return (1 + Math.sin(x)) / (1 + Math.abs(x));
        }
        // Метод для считывания и запоминания настроек:
        public Plotter remember(ButtonPanel panel) {
            return new Plotter(panel);
        }
        // Метод для отображения графика и сетки:
        public void plot(Graphics Fig) {
            // Параметры области отображения графика:
            int H, W, h, w, s = 20;
            H = getHeight();
            W = getWidth();
            h = H - 2 * s;
            w = W - 2 * s;
            // Очистка области графика:
            Fig.clearRect(0,0,W,H);
            // Индексная переменная и количество линий сетки:
            int k, nums = 10;
            // Цвет координатных осей - черный:
            Fig.setColor(Color.BLACK);
            // Отображение координатных осей:
            Fig.drawLine(s, s, s, h + s);
            Fig.drawLine(s, s + h, s + w, s + h);
            // Отображение засечек и числовых значений на координатных осях:
            for (k = 0; k <= nums; k++) {
                Fig.drawLine(s + k * w / nums, s + h, s + k * w / nums, s + h + 5);
                Fig.drawLine(s - 5, s + k * h / nums, s, s + k * h / nums);
                Fig.drawString(
                        Double.toString(xMin + k * (xMax - xMin) / nums),
                        s + k * w / nums - 5 , s + h + 15
                );
                Fig.drawString(Double.toString(yMin + k * ( yMax - yMin) / nums),
                        s - 17, s + h - 1 - k * h / nums
                );
            }
            // Отображение сетки (если установлена опция):
            if (status) {
                Fig.setColor(gColor);
                // Отображение линий сетки:
                for (k = 1; k <= nums; k++) {
                    Fig.drawLine(s + k * w / nums, s, s + k * w / nums, h + s);
                    Fig.drawLine(s,s + (k - 1) * h / nums,s + w,s + (k - 1) * h / nums);
                }
            }
            // Отображение графика:
            Fig.setColor(color);
            // Масштаб на один пиксель по каждой из координат:
            double dx = (xMax - xMin) / w, dy = (yMax - yMin) / h;
            // Переменные для записи декартовых координат:
            double x1, x2, y1, y2;
            // Переменные для записи координат в окне отображения графика:
            int h1, h2, w1, w2;
            // Начальные значения:
            x1 = xMin;
            y1 = f(x1);
            w1 = s;
            h1 = h + s - (int) Math.round(y1 / dy);
            // Шаг в пикселях для базовых точек:
            int step = 5;
            // Отображение базовых точек и соединение их линиями:
            for (int i = step; i <= w; i += step) {
                x2 = i * dx;
                y2 = f(x2);
                w2 = s + (int) Math.round(x2 / dx);
                h2 = h + s - (int) Math.round(y2 / dy);
                // Линия:
                Fig.drawLine(w1, h1, w2, h2);
                // Базовая точка (квадрат):
                Fig.drawRect(w1 - 2, h1 - 2,4, 4);
                // Новые значения для координат:
                x1 = x2;
                y1 = y2;
                w1 = w2;
                h1 = h2;
            }
        }
    }
    // Конструктор (аргументы - координаты и размеры панели, а также ссылка на панель с кнопками):
    PlotPanel(int x, int y, int w, int h, ButtonPanel panel) {
        // Создание объекта внутреннего класса:
        plotter = new Plotter(panel);
        // Цвет фона панели:
        setBackground(Color.WHITE);
        // Размеры и положение панели:
        setBounds(x,y,w,h);
    }
    // Переопределение метода для перерисовки панели:
    @Override
    public void paint(Graphics g){
        // при перерисовке панели вызывается метод для отображения графика:
        plotter.plot(g);
    }
}
// Класс для панели справки:
class HelpPanel extends Panel {
    // Метка:
    public Label label;
    // Текстовая область:
    public TextArea textArea;
    // Конструктор (аргументы - координаты и размеры панели):
    HelpPanel(int x, int y, int W, int H) {
        // Цвет фона панели:
        setBackground(Color.LIGHT_GRAY);
        // Размеры и положение панели:
        setBounds(x,y,W,H);
        // Отключение менеджера компоновки:
        setLayout(null);
        // Метка для панели:
        label = new Label("СПРАВКА", Label.CENTER);
        // Размеры и положение метки:
        label.setBounds(0,0,W,20);
        // Добавление метки на панель:
        add(label);
        // Текстовая область для панели:
        textArea = new TextArea("График функции y(x) = (1 + sin(x)) / (1 + |x|)");
        // Шрифт для текстовой области:
        textArea.setFont(new Font("Serif",Font.PLAIN,15));
        // Размер и положение текстовой области:
        textArea.setBounds(5,20,W - 10,60);
        // Область недоступна для редактирования:
        textArea.setEditable(false);
        // Добавление текстовой области на панель:
        add(textArea);
    }
}

// Класс обработчика первой кнопки:
class ButtonOneHandler implements ActionListener {
    // Панель с кнопками:
    private ButtonPanel buttonPanel;
    // Панель для отображения графика:
    private PlotPanel plotPanel;
    // Конструктор класса (аргументы - ссылки на панели):
    ButtonOneHandler(ButtonPanel buttonPanel, PlotPanel plotPanel) {
        this.buttonPanel = buttonPanel;
        this.plotPanel = plotPanel;
    }
    // Метод для обработки нажатия кнопки:
    @Override
    public void actionPerformed(ActionEvent event) {
        // Обновление параметров (настроек) для отображения графика:
        plotPanel.plotter = plotPanel.plotter.remember(buttonPanel);
        // Рисование графика:
        plotPanel.plotter.plot(plotPanel.getGraphics());
    }
}
// Класс обработчика второй кнопки:
class ButtonTwoHandler implements ActionListener {
    // Метод для обработки нажатия кнопки:
    @Override
    public void actionPerformed(ActionEvent event) {
        // Завершение выполнения программы:
        System.exit(0);
    }
}
// Класс обработчика для опции отображения сетки:
class CheckboxHandler implements ItemListener {
    // Список выбора цвета для сетки:
    private Choice choice;
    // Конструктор (аргумент - ссылка на панель с кнопками):
    CheckboxHandler(ButtonPanel panel) {
        this.choice = panel.choice;
    }
    // Метод для обработки изменения состояния опции:
    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        choice.setEnabled(itemEvent.getStateChange() == ItemEvent.SELECTED);
    }
}
// Главный класс:
class Demo {
    public static void main(String[] args) {
        // Создание (и отображение) окна:
        new PlotFrame(400,500);
    }
}