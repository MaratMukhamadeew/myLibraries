package practice.javaRush.tasks.tasks14__.task1421;

public class Solution {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
