package learn.programming_methods.glava2.resource.pool;

public class AudioChannel {
    private int channelId;

    public AudioChannel(int channelId) {
        this.channelId = channelId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }
    public void using() {
        try {
            // Использование канала
            Thread.sleep(new java.util.Random().nextInt(1000));
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
