package practice.javaRush.tasks.tasks15__.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

//        String[] str = url.split("\\?");
//        String[] str1 = str[1].split("&");
//
//        for (String s : str1) {
//            String[] res = s.split("=");
//            System.out.print(res[0] + " ");
//        }
//        System.out.println();
//
//        for (String s : str1) {
//            String[] res = s.split("=");
//            if (res[0].equals("obj")) {
//                if (res[1].matches("\\d+\\.+\\d+")) {
//                    double d = Double.parseDouble(res[1]);
//                    alert(d);
//                } else {
//                    alert(res[1]);
//                }
//            }
//        }

        String paramSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParams = paramSubString.split("&");
        String objValue = null;

        StringBuilder resultBuilder = new StringBuilder();
        for (String splitParam : splitParams) {
            String[] paramAndValue = splitParam.split("=");
            resultBuilder.append(paramAndValue[0]);
            resultBuilder.append(" ");

            if (paramAndValue[0].equals("obj")) {
                objValue = paramAndValue[1];
            }
        }

        System.out.println(resultBuilder.toString().trim());

        if (objValue != null) {
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}


// http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo&obj=Bob
// http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo