package learn.JavaInANutshell.classes;
/**
 * Этот класс демонстрирует возможные применения класса Rect
 * */
public class RectTest {
    public static void main(String[] args) {
        Rect r1 = new Rect(1, 1, 4, 4);
        Rect r2 = new Rect(2, 3, 5, 6);
        Rect u = r1.union(r2);
        Rect i = r2.interSection(r1);

        if (u.isInside(r2.x1, r2.y1))
            System.out.println("(" + r2.x1 + ", " + r2.y1 + ") содержится в объединении");

        System.out.println(r1 + " union " + r2 + " = " + u);
        System.out.println(r1 + " intersect " + r2 + " = " + i);
    }
}
