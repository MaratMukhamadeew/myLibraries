package learn.shildt.lang;

// Продемонстрировать применение некоторых методов типа Is

public class IsDemo {
    public static void main(String[] args) {
        char[] a = { 'a', 'b', '5', '?', 'A', ' ' };
        for (char ch : a) {
            if (Character.isDigit(ch)) System.out.println(ch + " - цифра.");
            if (Character.isLetter(ch)) System.out.println(ch + " - буква.");
            if (Character.isWhitespace(ch)) System.out.println(ch + " - пробельный символ.");
            if (Character.isUpperCase(ch)) System.out.println(ch + " - прописная буква.");
            if (Character.isLowerCase(ch)) System.out.println(ch + " - строчная буква.");
        }
    }
}
