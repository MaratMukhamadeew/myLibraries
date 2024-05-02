package learn.JavaInANutshell.classes;

import java.util.Date;

/**
 * Этот класс определяет методы для вычисления псевдослучайных чисел
 * и определяет переменную состояния, которая должна сохраняться для нужд этих методов.
 * */
public class Randomizer {
    static final int m = 233280;
    static final int a = 9301;
    static final int c = 49297;
    int seed = 1; //Переменная состояния, сохраняемая каждым экземпляром Randomizer

    public Randomizer(int seed) {
        this.seed = seed;
    }
    /**
     * Метод вычисляет псевдослучайные числа в промежутке от 0 до 1 с применением очень простого
     * алгоритма. Методы Math.random() и java.util.Random вычисляют случайные числа гораздо лучше.
     * */
    public float randomFloat() {
        seed = (seed * a + c) % m;
        return (float) Math.abs((float) seed / m);
    }
    /**
     * Метод вычисляет псевдослучайные числа в промежутке между 0 и заданным максимальным значением.
     * Он использует вышеприведенный метод randomFloat().
     * */
    public int randomInt(int max) {
        return Math.round(max * randomFloat());
    }
    /**
     * Этот вложенный класс является простой тестовой программой: он печатает 10 случайных чисел.
     * Объект Randomizer получает стартовое значение с применением текущего значения времени.
     * */
    public static class Test {
        public static void main(String[] args) {
            Randomizer r = new Randomizer((int) new Date().getTime());
            for (int i = 0; i < 10; i++) {
                System.out.println(r.randomInt(1000));
            }
        }
    }
}
