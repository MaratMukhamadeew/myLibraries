package learn.programming_methods.glava2.threads.synch;

import java.io.IOException;

public class SynchroRun {
    public static void main(String[] args) {
        Resource res = null;
        try {
            res = new Resource("src\\main\\resources\\txt_files\\result.txt");
            SyncThread t1 = new SyncThread("First", res);
            SyncThread t2 = new SyncThread("Second", res);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (IOException ex) {
            System.err.println("Ошибка файла: " + ex);
        } catch (InterruptedException ex) {
            System.err.println("Ошибка потока: " + ex);
        } finally {
            res.close();
        }
    }
}
