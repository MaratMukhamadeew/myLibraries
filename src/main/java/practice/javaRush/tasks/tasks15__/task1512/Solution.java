package practice.javaRush.tasks.tasks15__.task1512;

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }
    public static class NakedCat {
    }
    public static class NormalCat extends NakedCat {
        public NormalCat() {
        }
        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }
        public NakedCat shave() {
            return this;
        }
    }
    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
