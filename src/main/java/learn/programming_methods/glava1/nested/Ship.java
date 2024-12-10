package learn.programming_methods.glava1.nested;

public class Ship {
    private int id;
    // abstract, final, private, protected - допустимы
    public static class LifeBoat {
        private int boatId;
        public static void down() {
            System.out.println("Шлюпки на воду!");
        }
        public void swim() {
            System.out.println("Отплытие шлюпки");
        }
    }
}
