package learn.shildt.string;

// Замена подстроки

public class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;
        do { // Заменить все совпавшие символы
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result = result.concat(sub);
                result = result.concat(org.substring(i + search.length()));
                org = result;
            }
        } while (i != -1);
    }
}
