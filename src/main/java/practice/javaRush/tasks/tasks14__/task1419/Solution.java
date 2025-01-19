package practice.javaRush.tasks.tasks14__.task1419;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }
    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] items = null;
            System.out.println(items[5]);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            int[] items = {1, 2, 3};
            System.out.println(items[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            File file = new File("fileName");
            InputStream is = new FileInputStream(file);
            is.close();
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            new Long("xyz");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            Object obj = "Java Exception";
            Integer number = (Integer) obj;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            int number = -5;
            if(number <= 0) {
                throw new IllegalArgumentException("You cannot pass a negative number or zero");
            }
            System.out.println(number);
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        try {
            List<String> list = (Arrays.asList("Java", "Angular", "Spring"));
            list.add("Python");
        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        }
        try {
            Solution solution = new Solution();
            Method method = solution.getClass().getMethod("...");
        } catch (NoSuchMethodException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            Iterator<String> iterator = list.iterator();
            list.add("Hello");
            list.add("World");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (ConcurrentModificationException e) {
            exceptions.add(e);
        }
    }
}
