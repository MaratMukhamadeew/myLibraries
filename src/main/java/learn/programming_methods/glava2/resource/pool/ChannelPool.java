package learn.programming_methods.glava2.resource.pool;

import learn.programming_methods.glava2.resource.pool.exception.ResourceException;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ChannelPool<T> {
    private static final int POOL_SIZE = 5; // Размер пула
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final Queue<T> resources = new LinkedList<>();

    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
    }
    public T getResources(long maxWaitMillis) throws ResourceException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                return resources.poll();
            }
        } catch (InterruptedException ex) {
            throw new ResourceException(ex);
        }
        throw new ResourceException(": превышено время ожидания");
    }
    public void returnResource(T res) {
        resources.add(res); // Возвращение экземпляра в пул
        semaphore.release();
    }
}
