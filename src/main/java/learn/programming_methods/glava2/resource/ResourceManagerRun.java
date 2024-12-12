package learn.programming_methods.glava2.resource;

import java.util.Locale;

public class ResourceManagerRun {
    public static void main(String[] args) {
        ResourceManager manager = ResourceManager.INSTANCE;
        System.out.println(manager.getString("str1"));

        manager.changeResource(new Locale("be", "BY"));
        System.out.println(manager.getString("str1"));

        manager.changeResource(new Locale("en", "US"));
        System.out.println(manager.getString("str1"));
    }
}
