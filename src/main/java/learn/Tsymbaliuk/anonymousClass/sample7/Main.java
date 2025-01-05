package learn.Tsymbaliuk.anonymousClass.sample7;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass("Cat");
        Comparable<String> comparable = null;
        try {
            comparable = oc.cmp.getClass().getDeclaredConstructor(OuterClass.class).newInstance(oc);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException ex) {
            ex.printStackTrace();
        }

        System.out.println(oc.cmp);
        System.out.println(oc.cmp == comparable);
    }
}
