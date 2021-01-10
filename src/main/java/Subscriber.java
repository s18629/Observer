public class Subscriber implements Observer {

    private final YouTubeChannel youtubechannel;
    private String newestVideo;

    public Subscriber(YouTubeChannel youtubechannel) {
        this.youtubechannel = youtubechannel;
        newestVideo = youtubechannel.getNewestVideo();
    }

    @Override
    public void update() {
        newestVideo = youtubechannel.getNewestVideo();
        System.out.println("New video is here! " + newestVideo);
    }
}
