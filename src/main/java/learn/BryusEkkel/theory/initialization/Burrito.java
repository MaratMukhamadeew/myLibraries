package learn.BryusEkkel.theory.initialization;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT -> System.out.println("not spicy at all.");
            case MILD, MEDIUM -> System.out.println("a little hot.");
            case HOT, FLAMING -> System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT);
        Burrito greenChile = new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno = new Burrito(Spiciness.HOT);

        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
