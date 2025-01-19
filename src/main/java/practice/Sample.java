package practice;

public class Sample {
    public static void main(String[] args) {

    }

    public static void print2() {
        for (int i = 56; i > 0; i = i + 10) {
            System.out.println("YES");
            if (i > 60) {
                break;
            }
        }
    }
    public static void print3() {
        int i = 0;
        while (i > 0) {
            i = i + 1;
            System.out.println("YES");
        }
    }
    public static void print4() {
        int i = 0;
        while (i < 20) {
            if (i > 6 && i < 10) {
                continue;
            }
            System.out.println("YES");
            i = i + 1;
        }
    }
    public static void print5() {
        for (int i = 0; i < 10;) {
            if (i < 5) {
                i++;
            }
            i++;
            System.out.println("YES");
        }
    }
}
