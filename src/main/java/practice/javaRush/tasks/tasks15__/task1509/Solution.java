package practice.javaRush.tasks.tasks15__.task1509;

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        printName(man);
        printName(woman);
    }
    public static void printName(Human human){

    }
    public static class Human {}
    public static class Man extends Human {}
    public static class Woman extends Human {}
}
