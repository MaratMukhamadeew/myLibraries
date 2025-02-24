package learn.Tsymbaliuk.javacore.Comparable.sample1;

public class Main {
    public static void main(String[] args) {
        Cat a = new Cat("Umka", 12);
        Cat b = new Cat("Luska", 5);
        Cat c = new Cat("Kuzia", 2);
        Cat d = new Cat("Umka", 12);
        Cat e = new Cat("Barsic", 12);

        System.out.println(sgn(a.compareTo(b)) == -sgn(b.compareTo(a)));
        System.out.println((a.compareTo(b) > 0 && b.compareTo(c) > 0) && a.compareTo(c) > 0);
        System.out.println(a.compareTo(d) == 0 && (sgn(a.compareTo(c)) == sgn(d.compareTo(c))));

        System.out.println(a.equals(d) == true && a.compareTo(d) == 0);

        System.out.println(a.equals(b) == false && a.compareTo(b) != 0);

        System.out.println(a.equals(e) == false && a.compareTo(e) != 0);
    }

    public static int sgn(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }
}
