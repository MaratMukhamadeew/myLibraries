package practice.javaRush.tasks.tasks16__.task1602;

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.run();
    }

    public static class TestThread extends Thread {
        static  {
            System.out.println("it's a static block inside TestThread");
        }
        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}
