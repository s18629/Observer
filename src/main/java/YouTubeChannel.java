import java.util.ArrayList;

public class YouTubeChannel implements Observable {

    public ArrayList<Observer> getSubscribers() {
        return subscribers;
    }

    ArrayList <Observer> subscribers = new ArrayList<>();

    public String getNewestVideo() {
        return newestVideo;
    }

    public void publishNewVideo(String video){
        newestVideo = video;
        notifySubscribers();
    }

    private String newestVideo;

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Observer::update);
    }

}
