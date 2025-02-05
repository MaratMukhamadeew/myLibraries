package practice.javaRush.tasks.tasks15__.task1505;

public class Solution {
    public interface HasWeight {
        int getWeight();
    }
    public interface HasHeight {
        int getHeight();
    }
    public static class Human implements HasWeight, HasHeight {
        @Override
        public int getWeight() {
            return 80;
        }
        @Override
        public int getHeight() {
            return 170;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}
