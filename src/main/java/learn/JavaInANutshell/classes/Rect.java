package learn.JavaInANutshell.classes;

/**
 * Этот класс представляет прямоугольник. Его поля представляют координаты углов
 * этого прямоугольника. Его методы определяют операции, которые могут осуществляться с объектами Rect.
 **/
public class Rect {
    public int x1, y1, x2, y2;

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public Rect() {
        this(0, 0, 0, 0);
    }
    /**
     * Перемещение прямоугольника на указанные расстояния
     * */
    public void move(int deltaX, int deltaY) {
        x1 += deltaX; x2 += deltaX;
        y1 += deltaY; y2 += deltaY;
    }
    /**
     * Проверяем, находится ли заданная точка внутри прямоугольника
     * */
    public boolean isInside(int x, int y) {
        return ((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2));
    }
    /**
     * Возвращается объединение этого прямоугольника с другим. Другими словами,
     * возвращается наименьший прямоугольник, содержащий оба прямоугольника.
     * */
    public Rect union(Rect r) {
        return new Rect((this.x1 < r.x1) ? this.x1 : r.x1,
                Math.min(this.y1, r.y1),
                (this.x2 > r.x2) ? this.x2 : r.x2,
                Math.max(this.y2, r.y2));
    }
    /**
     * Возвращается пересечение этого прямоугольника с другим.
     * Другими словами, возвращается область их наложения.
     * */
    public Rect interSection(Rect r) {
        Rect result = new Rect(Math.max(this.x1, r.x1),
                Math.max(this.y1, r.y1),
                Math.min(this.x2, r.x2),
                Math.min(this.y2, r.y2));
        if (result.x1 > result.x2) result.x1 = result.x2 = 0;
        if (result.y1 > result.y2) result.y1 = result.y2 = 0;
        return result;
    }

    @Override
    public String toString() {
        return "[" + x1 + ", " + y1 + "; " + x2 + ", " + y2 + "]";
    }
}
