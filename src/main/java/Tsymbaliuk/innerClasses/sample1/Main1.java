package Tsymbaliuk.innerClasses.sample1;

public class Main1 {
    public static void main(String[] args) {
        Letter letter = new Letter("Ivan");

        Letter.Address address = letter.new Address(5);

        System.out.println(address.getLetterSender());
        System.out.println(letter);
        System.out.println(address);

    }
}
