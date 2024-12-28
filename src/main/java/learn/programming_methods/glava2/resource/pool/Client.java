package learn.programming_methods.glava2.resource.pool;

import learn.programming_methods.glava2.resource.pool.exception.ResourceException;

public class Client extends Thread {
    private boolean reading = false;
    private ChannelPool<AudioChannel> pool;
    public Client(ChannelPool<AudioChannel> pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        AudioChannel channel = null;
        try {
            channel = pool.getResources(500); // Изменить на 100
            reading = true;
            System.out.println("Channel Client #" + this.getId() + " took channel #" + channel.getChannelId());
            channel.using();
        } catch (ResourceException e) {
            System.err.println("Client #" + this.getId() + " lost -> " + e.getMessage());
        } finally {
            if (channel != null) {
                reading = false;
                System.out.println("Channel Client #" + this.getId() + " took channel #" + channel.getChannelId() +
                        " channel released");
                pool.returnResource(channel);
            }
        }
    }
    public boolean isReading() {
        return reading;
    }
}
