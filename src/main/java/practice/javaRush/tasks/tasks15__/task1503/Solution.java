package practice.javaRush.tasks.tasks15__.task1503;

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }
    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(Constant.WANT_STRING + Constant.FERRARI_NAME);
        }
    }
    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(Constant.WANT_STRING + Constant.LANOS_NAME);
        }
    }
    public static class LuxuriousCar {
        void printlnDesire() {
            System.out.println(Constant.WANT_STRING + Constant.LUXURIOUS_CAR);
        }
    }
    public static class CheapCar {
        protected void printlnDesire() {
            System.out.println(Constant.WANT_STRING + Constant.CHEAP_CAR);
        }
    }
    public static class Constant {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}
