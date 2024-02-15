package learn.BryusEkkel.theory.initialization;

import static learn.BryusEkkel.util.Print.*;

class Tree {
    int height;

    public Tree() {
        print("Сажаем росток");
        height = 0;
    }
    public Tree(int initialHeight) {
        height = initialHeight;
        print("Создание нового дерева высотой " + height + " м.");
    }
    void info() {
        print("Дерево высотой " + height + " м.");
    }
    void info(String info) {
        print(info + ": дерево высотой " + height + " м.");
    }
}
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Перегруженный метод");
        }
        Tree tree = new Tree();     // Перегруженный конструктор
    }
}
