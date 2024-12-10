package learn.programming_methods.glava1.anonym;

public class Runner {
    public static void main(String[] args) {
        String ob = "qweRtRRR";
        WrapperString wrFirst = new WrapperString(ob);

        // Анонимный класс №1
        WrapperString wrLast = new WrapperString(ob) {
            // Замена последнего символа
            @Override
            public String replace(char oldChar, char newChar) {
                char[] array = getStr().toCharArray();
//                char[] array = new char[getStr().length()];
//                getStr().getChars(0, getStr().length(), array, 0);
                for (int i = array.length - 1; i > 0; i--) {
                    if (array[i] == oldChar) {
                        array[i] = newChar;
                        break;
                    }
                }
                return new String(array);
            }
        }; // Конец объявления анонимного класса

        // Анонимный класс №2
        WrapperString wr2 = new WrapperString(ob) {
            private int position = 2; // Собственное поле
            // Замена символа по позиции
            @Override
            public String replace(char oldChar, char newChar) {
                int counter = 0;
                char[] array = getStr().toCharArray();
//                char[] array = new char[getStr().length()];
//                getStr().getChars(0, getStr().length(), array, 0);
                if (verify(oldChar, array)) {
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == oldChar) {
                            counter++;
                            if (counter == position) {
                                array[i] = newChar;
                                break;
                            }
                        }
                    }
                }
                return new String(array);
            }
            public boolean verify(char oldChar, char[] array) {
                int counter = 0;
                for(char c : array) {
                    if (c == oldChar) {
                        counter++;
                    }
                }
                return counter >= position;
            }
        }; // Конец объявления анонимного класса
        System.out.println(wrLast.replace('R', 'Y'));
        System.out.println(wr2.replace('R', 'Y'));
        System.out.println(wrFirst.replace('R', 'Y'));
    }
}
