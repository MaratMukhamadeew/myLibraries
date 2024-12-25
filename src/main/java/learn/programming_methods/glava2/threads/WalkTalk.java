package learn.programming_methods.glava2.threads;

public class WalkTalk {
    public static void main(String[] args) {
        // Новые объекты потоков
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());

        // Запуск потоков
        talk.start();
        walk.start();

//        WalkRunnable walk = new WalkRunnable(); // Просто объект, не поток
//        walk.run(); или talk.run(); // Выполнится метод, но поток не запустится
    }
}
