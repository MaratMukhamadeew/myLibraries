package learn.JavaInANutshell.basics;

/**
 * Эта программа играет в FizzBuzz. Она считает до 100, заменяя каждое число,
 * кратное 3, словом "Fizz", каждое число, кратное 5,- словом "Buzz"
 * и каждое число, кратное 15,- "FizzBuzz". Для определения того,
 * делится ли одно число на другое, в ней используется оператор
 * остатка целочисленного деления (%).
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(decryptMessage("helllooookkk world"));
//        fizzBuzz();
    }

    public static void fizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (((i % 15) == 0)) {
                System.out.print("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.print("Fizz");
            } else if ((i % 5) == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public static String decryptMessage(String encryptedMessage) {
        String[] words = encryptedMessage.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {

            char[] word = words[i].toCharArray();
            int counter = 1;
            char ch = word[0];
            for (int j = 1; j < word.length; j++) {

                if (word[j] == ch) {
                    counter++;
                } else if (word[j] != ch && counter > 1) {
                    word[j - 1] = (char) (counter + 48);
                    counter = 1;
                }
                ch = word[j];
            }
            if (word[word.length - 1] == word[word.length - 2]) {
                word[word.length - 1] = (char) (counter + 48);
            }

            sb.append(word).append(" ");
        }
        return sb.toString();
    }
}
