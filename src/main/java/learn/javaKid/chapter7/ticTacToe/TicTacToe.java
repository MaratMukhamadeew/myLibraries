package learn.javaKid.chapter7.ticTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe {
 JPanel windowContext;
 JButton[] squares;
 JButton newGameButton;
 TicTacToeEngine engine;
 JLabel score;
 JPanel topPanel;
 JPanel centerPanel;

 public TicTacToe() {
  windowContext = new JPanel();

  // Задаем схему для этой панели
  BorderLayout borderLayout = new BorderLayout();
  windowContext.setLayout(borderLayout);
  windowContext.setBackground(Color.CYAN);

  // Изменяем шрифт так, чтобы он был жирным и имел размер 20
  Font font = new Font("Monospased", Font.BOLD, 20);
  windowContext.setFont(font);

  // Создаем кнопку "New game" и регистрируем в ней слушатель действия
  engine = new TicTacToeEngine(this);
  newGameButton = new JButton("New game");
  newGameButton.setFont(font);
  newGameButton.addActionListener(engine);

  topPanel = new JPanel();
  topPanel.add(newGameButton);
  windowContext.add("North", topPanel);

  centerPanel = new JPanel();
  centerPanel.setLayout(new GridLayout(3,3,2,2));

  // Создаем массив, чтобы хранить ссылки на 9 кнопок
  squares = new JButton[9];

  // Создаем кнопки, сохраняем ссылки на них в массиве, регистрируем в них слушатель,
  // красим их в оранжевый цвет и добавляем на панель
  for (int i = 0; i < squares.length; i++) {
   squares[i] = new JButton();
   squares[i].addActionListener(engine);
   squares[i].setBackground(Color.ORANGE);
   Dimension dim = new Dimension(100,50);
   squares[i].setPreferredSize(dim);
   centerPanel.add(squares[i]);
  }
  windowContext.add("Center", centerPanel);

  score = new JLabel("Your turn!");
  score.setFont(font);
  windowContext.add("South", score);

  JFrame frame = new JFrame("TicTacToe");
  frame.setContentPane(windowContext);

  // Задаем размер окна достаточным для того, чтобы вместить все компоненты
  frame.pack();

  // Отображаем окно
  frame.setVisible(true);
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

 }

 public static void main(String[] args) {
  TicTacToe ticTacToe = new TicTacToe();
 }
}
