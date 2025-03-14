package practice.javaRush.tasks.tasks15__.task1524;

public class Solution {
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }
    public int i = 6;
    public String name = "First name";
    static {
        init();
    }
    static {
        System.out.println("Static block");
    }
    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }
    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
