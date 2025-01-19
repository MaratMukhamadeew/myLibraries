package practice.javaRush.tasks.tasks15__.task1502;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Goose().getSize());
        System.out.println(new Dragon().getSize());
    }
    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }
    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }
    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }
}


