package shildt.string;

// Продемонстрировать применение метода join(), определенного в классе String

public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        String[] strs = { "John", "ID#: 567", "E-mail: John@123.com" };
        result = String.join(", ", strs);
        System.out.println(result);
    }
}
