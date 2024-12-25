package learn.programming_methods.glava2.threads.priority;

public class PriorityRunner {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Группа потоков 1");
        PriorThread min = new PriorThread(threadGroup, "Min");
        PriorThread max = new PriorThread( threadGroup, "Max");
        PriorThread norm = new PriorThread("Norm");
        min.setPriority(Thread.MIN_PRIORITY); // 1
        max.setPriority(Thread.MAX_PRIORITY); // 10
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        min.start();
        max.start();
        norm.start();
    }
}
