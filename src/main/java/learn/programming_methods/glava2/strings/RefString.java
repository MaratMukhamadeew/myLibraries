package learn.programming_methods.glava2.strings;

public class RefString {
    public static void changeStr(String s) {
        s = s.concat(" Certified"); // Создаётся новая строка
//        s.concat(" Certified");
//        s += " Certified";
    }

    public static void main(String[] args) {
        String str = "Java";
        changeStr(str);
        System.out.println(str);
    }
}
