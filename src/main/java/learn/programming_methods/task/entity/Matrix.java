package learn.programming_methods.task.entity;

import learn.programming_methods.task.exceptions.MatrixException;

public class Matrix {
    private final int[][] a;
    public Matrix(int n, int m) throws MatrixException {
        // Проверка на отрицательные значения размерности матрицы
        if ((n < 1) || (m < 1)) {
            throw new MatrixException();
        }
        a = new int[n][m];
    }
    public int getVerticalSize() {
        return a.length;
    }
    public int getHorizontalSize() {
        return a[0].length;
    }
    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) { // Проверка i и j
            return a[i][j];
        }
        throw new MatrixException();
    }
    public void setElement(int i, int j, int value) throws MatrixException {
        if (checkRange(i, j)) { // Проверка i и j
            a[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nMatrix : " + a.length + "x" + a[0].length + "\n");
        for(int[] row : a) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    // Проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        return i >= 0 && i < a.length && j >= 0 && j < a[0].length;
    }
}
