package practice.javaRush.tasks.tasks15__.task1530;

public class Solution {
    public static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        DrinkMaker latte = new LatteMaker();
        tea.makeDrink();
        System.out.println();
        latte.makeDrink();
    }
}
