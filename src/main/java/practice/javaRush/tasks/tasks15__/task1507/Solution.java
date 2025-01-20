package practice.javaRush.tasks.tasks15__.task1507;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2,3,"8");
        printMatrix(2,"8");
        printMatrix(2,"8","9");
        printMatrix(2, 3.3,"8");
        printMatrix(2,3,4.4);
    }
    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m,n,(Object) value);
    }
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(n,(Object) value);
    }
    public static void printMatrix(int n, Object value) {
        for (int i = 0; i < n; i++) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void printMatrix(int m, String value1, String value2) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, value1, (Object) value2);
    }
    public static void printMatrix(int m, Object value1, Object value2) {
        for (int i = 0; i < m; i++) {
            System.out.print(value1 + " " + value2 + " ");
        }
        System.out.println();
    }
    public static void printMatrix(int m, double n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m,n,(Object) value);
    }
    public static void printMatrix(int m, double n, Object value) {
        for (int i = 0; i < m; i++) {
            System.out.print(value + " " + n);
        }
        System.out.println();
    }
    public static void printMatrix(int m, int n, double d) {
        System.out.println("Заполняем объектами String" + d);
        printMatrix(m,n);
    }
    public static void printMatrix(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
