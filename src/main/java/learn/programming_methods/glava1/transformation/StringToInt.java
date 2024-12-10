package learn.programming_methods.glava1.transformation;

public class StringToInt {
    public static void main(String[] args) {
        String arg1 = "71";
        String arg2 = "071";
        String arg3 = "0x71";
        String arg4 = "0b1000111";

        int i1 = 0x71;
        int i2 = 0b1000111;
        System.out.println(i1 + " ----- " + i2);

        int arRef[], ar;
        float[] arFlRef, flRef;

        print(arg1);
        print(arg2);
        print(arg3);
        print(arg4);

    }
    public static void print(String str) {
        try {
            System.out.println("Возвращает int " + Integer.parseInt(str)); // Возвращает int
            System.out.println("Возвращает Integer " + Integer.valueOf(str)); // Возвращает Integer
            System.out.println("Возвращает Integer " + Integer.decode(str)); // Возвращает Integer
            System.out.println("Создаёт Integer " + new Integer(str)); // Создаёт Integer, для преобразования применяется редко
            System.out.println();
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }
    }
}
