package learn.javaKid.chapter7.ticTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeEngine implements ActionListener {
    TicTacToe parent;
    int emptySquaresLeft = 9;
    public TicTacToeEngine(TicTacToe parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton theButton = (JButton) e.getSource();

        // Это кнопка New game?

        if (theButton == parent.newGameButton) {
            for (int i = 0; i < parent.squares.length; i++) {
                parent.squares[i].setEnabled(true);
                parent.squares[i].setLabel("");
                parent.squares[i].setBackground(Color.ORANGE);
            }
            emptySquaresLeft = 9;
            parent.score.setText("Your turn!");
            parent.newGameButton.setEnabled(false);
            return; // Выходим из метода
        }
        String winner = "";

        // Это одна из клеток?
        for (int i = 0; i < parent.squares.length; i++) {
            if (theButton == parent.squares[i]) {
                parent.squares[i].setLabel("X");
                winner = lookForWinner();
                if (!"".equals(winner)) {
                    endTheGame();
                } else {
                    computerMove();
                    winner = lookForWinner();
                    if (!"".equals(winner)) {
                        endTheGame();
                    }
                }
                break;
            }
        } // Конец цикла for
        if (winner.equals("X")) {
            parent.score.setText("You won!");
        } else if (winner.equals("O")) {
            parent.score.setText("You lost!");
        } else if (winner.equals("T")) {
            parent.score.setText("It's a tie!");
        }
    } // Конец метода actionPerformed

    String lookForWinner() {
        String theWinner = "";
        emptySquaresLeft--;
        if (emptySquaresLeft == 0) {
            return "T"; // Это ничья. T от английского tie
        }

        // Проверяем ряд 1 - элементы массива 0, 1, 2
        if (!parent.squares[0].getLabel().equals("") &&
                parent.squares[0].getLabel().equals(parent.squares[1].getLabel()) &&
                parent.squares[0].getLabel().equals(parent.squares[2].getLabel())) {
            theWinner = parent.squares[0].getLabel();
            highlightWinner(0, 1, 2);
            // Проверяем ряд 2 - элементы массива 3, 4, 5
        } else if (!parent.squares[3].getLabel().equals("") &&
                parent.squares[3].getLabel().equals(parent.squares[4].getLabel()) &&
                parent.squares[3].getLabel().equals(parent.squares[5].getLabel())) {
            theWinner = parent.squares[3].getLabel();
            highlightWinner(3, 4, 5);
            // Проверяем ряд 3 - элементы массива 6, 7, 8
        } else if (!parent.squares[6].getLabel().equals("") &&
                parent.squares[6].getLabel().equals(parent.squares[7].getLabel()) &&
                parent.squares[6].getLabel().equals(parent.squares[8].getLabel())) {
            theWinner = parent.squares[3].getLabel();
            highlightWinner(6, 7, 8);
            // Проверяем колонку 1 - элементы массива 0, 3, 6
        } else if (!parent.squares[0].getLabel().equals("") &&
                parent.squares[0].getLabel().equals(parent.squares[3].getLabel()) &&
                parent.squares[0].getLabel().equals(parent.squares[6].getLabel())) {
            theWinner = parent.squares[0].getLabel();
            highlightWinner(0, 3, 6);
            // Проверяем колонку 2 - элементы массива 1, 4, 7
        } else if (!parent.squares[1].getLabel().equals("") &&
                parent.squares[1].getLabel().equals(parent.squares[4].getLabel()) &&
                parent.squares[1].getLabel().equals(parent.squares[7].getLabel())) {
            theWinner = parent.squares[1].getLabel();
            highlightWinner(1, 4, 7);
            // Проверяем колонку 3 - элементы массива 2, 5, 8
        } else if (!parent.squares[2].getLabel().equals("") &&
                parent.squares[2].getLabel().equals(parent.squares[5].getLabel()) &&
                parent.squares[2].getLabel().equals(parent.squares[8].getLabel())) {
            theWinner = parent.squares[0].getLabel();
            highlightWinner(2, 5, 8);
            // Проверяем первую диагональ - элементы массива 0, 4, 8
        } else if (!parent.squares[0].getLabel().equals("") &&
                parent.squares[0].getLabel().equals(parent.squares[4].getLabel()) &&
                parent.squares[0].getLabel().equals(parent.squares[8].getLabel())) {
            theWinner = parent.squares[0].getLabel();
            highlightWinner(0, 4, 8);
            // Проверяем вторую диагональ - элементы массива 2, 4, 6
        } else if (!parent.squares[2].getLabel().equals("") &&
                parent.squares[2].getLabel().equals(parent.squares[4].getLabel()) &&
                parent.squares[2].getLabel().equals(parent.squares[6].getLabel())) {
            theWinner = parent.squares[0].getLabel();
            highlightWinner(2, 4, 6);
        }
        return theWinner;
    }

    void computerMove() {
        int selectedSquare;

        // Сначала компьютер пытается найти пустую клетку рядом с двумя клетками с ноликами, чтобы выиграть
        selectedSquare = findEmptySquare("O");

        // Если он не может найти два нолика, то хотя бы попытается не дать оппоненту сделать
        // ряд из 3-х крестиков, поместив нолик рядом с двумя крестиками
        if (selectedSquare == -1) {
            selectedSquare = findEmptySquare("X");
        }

        // Если selectedSquare все еще равен -1, то попытается занять центральную клетку
        if ((selectedSquare == -1) && (parent.squares[4].getLabel().equals(""))) {
            selectedSquare = 4;
        }

        // Не повезло с центральной клеткой... просто занимаем случайную клетку
        if (selectedSquare == -1) {
            selectedSquare = getRandomSquare();
        }
        parent.squares[selectedSquare].setLabel("O");
    }

    int findEmptySquare(String player) {
        int[] weight = new int[9];
        for (int i = 0; i < weight.length; i++) {
            if (parent.squares[i].getLabel().equals("O")) {
                weight[i] = -1;
            } else if (parent.squares[i].getLabel().equals("X")) {
                weight[i] = 1;
            } else {
                weight[i] = 0;
            }
        }
        int twoWeights = player.equals("O") ? -2 : 2;

        // Проверим, есть ли в ряду 1 две одинаковые клетки и одна пустая.
        if (weight[0] + weight[1] + weight[2] == twoWeights) {
            if (weight[0] == 0) {
                return 0;
            } else if (weight[1] == 0) {
                return 1;
            } else {
                return 2;
            }
        }

        // Проверим, есть ли в ряду 2 две одинаковые клетки и одна пустая.
        if (weight[3] + weight[4] + weight[5] == twoWeights) {
            if (weight[3] == 0) {
                return 3;
            } else if (weight[4] == 0) {
                return 4;
            } else {
                return 5;
            }
        }

        // Проверим, есть ли в ряду 3 две одинаковые клетки и одна пустая.
        if (weight[6] + weight[7] + weight[8] == twoWeights) {
            if (weight[6] == 0) {
                return 6;
            } else if (weight[7] == 0) {
                return 7;
            } else {
                return 8;
            }
        }

        // Проверим, есть ли в колонке 1 две одинаковые клетки и одна пустая.
        if (weight[0] + weight[3] + weight[6] == twoWeights) {
            if (weight[0] == 0) {
                return 0;
            } else if (weight[3] == 0) {
                return 3;
            } else {
                return 6;
            }
        }

        // Проверим, есть ли в колонке 2 две одинаковые клетки и одна пустая.
        if (weight[1] + weight[4] + weight[7] == twoWeights) {
            if (weight[1] == 0) {
                return 1;
            } else if (weight[4] == 0) {
                return 4;
            } else {
                return 7;
            }
        }

        // Проверим, есть ли в колонке 3 две одинаковые клетки и одна пустая.
        if (weight[2] + weight[5] + weight[8] == twoWeights) {
            if (weight[2] == 0) {
                return 2;
            } else if (weight[5] == 0) {
                return 5;
            } else {
                return 8;
            }
        }

        // Проверим, есть ли в диагонали 1 две одинаковые клетки и одна пустая.
        if (weight[0] + weight[4] + weight[8] == twoWeights) {
            if (weight[0] == 0) {
                return 0;
            } else if (weight[4] == 0) {
                return 4;
            } else {
                return 8;
            }
        }

        // Проверим, есть ли в диагонали 2 две одинаковые клетки и одна пустая.
        if (weight[2] + weight[4] + weight[6] == twoWeights) {
            if (weight[2] == 0) {
                return 2;
            } else if (weight[4] == 0) {
                return 4;
            } else {
                return 6;
            }
        }

        // Не найдено двух одинаковых соседних клеток
        return -1;
    }

    int getRandomSquare() {
        boolean gotEmptySquare = false;

        int selectedSquare = -1;
        do {
            selectedSquare = (int) (Math.random() * 9);
            if (parent.squares[selectedSquare].getLabel().equals("")) {
                gotEmptySquare = true; // Чтобы закончить цикл
            }
        } while (!gotEmptySquare);
        return selectedSquare;
    } // Конец метода getRandomSquare()

    void highlightWinner(int win1, int win2, int win3) {
        parent.squares[win1].setBackground(Color.CYAN);
        parent.squares[win2].setBackground(Color.CYAN);
        parent.squares[win3].setBackground(Color.CYAN);
    }

    // Делаем недоступными клетки и доступной кнопку "New game"
    void endTheGame() {
        parent.newGameButton.setEnabled(true);
        for (int i = 0; i < 9; i++) {
            parent.squares[i].setEnabled(false);
        }
    }
}
