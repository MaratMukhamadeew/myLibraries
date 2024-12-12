package learn.programming_methods.glava2.strings;

public class SortArray {
    public static void main(String[] args) {
        String names = "   Alena Alice      alina albina     Anastasia   ALLA  ArinA    ";
        names.trim(); // Удаление пробелов по краям строки
        // Разбитие строки на подстроки, где "пробел" - разделитель
        String[] stringsName = names.split(" "); // Массив содержит элементы нулевой длины
        for (int j = 0; j < stringsName.length - 1; j++) {
            for (int i = j + 1; i < stringsName.length; i++) {
                if (stringsName[i].compareToIgnoreCase(stringsName[j]) < 0) {
                    String temp = stringsName[j];
                    stringsName[j] = stringsName[i];
                    stringsName[i] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : stringsName) {

            if (!str.isEmpty()) {
                sb.append(str).append(" ");
                System.out.println(str + " ");
            }
        }
        System.out.println(sb);
    }
}
