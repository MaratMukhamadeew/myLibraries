package learn.BryusEkkel.theory.control;

public class ListCharacters {
    public static void main(String[] args) {
        for (char i = 0; i < 128; i++) {
            if (Character.isLowerCase(i))
                System.out.println("Значение: " + (int)i + " символ: " + i);
        }
    }
}
