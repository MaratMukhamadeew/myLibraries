package learn.programming_methods.glava1.anonym;

public class WrapperString {
    private String str;
    public WrapperString(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    public String replace(char oldChar, char newChar) { // Замена первого символа
        char[] array = str.toCharArray();
//        char[] array = new char[str.length()];
//        str.getChars(0, str.length(), array, 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldChar) {
                array[i] = newChar;
                break;
            }
        }
        return new String(array);
    }
}
