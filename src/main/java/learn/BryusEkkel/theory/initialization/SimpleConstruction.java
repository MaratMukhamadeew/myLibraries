package learn.BryusEkkel.theory.initialization;

public class SimpleConstruction {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}