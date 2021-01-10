public class Main {
    public static void main(String[] args) {
        YouTubeChannel firstChannel = new YouTubeChannel();

        Subscriber subscriber1 = new Subscriber(firstChannel);
        Subscriber subscriber2 = new Subscriber(firstChannel);
        Subscriber subscriber3 = new Subscriber(firstChannel);
        Subscriber subscriber4 = new Subscriber(firstChannel);

        firstChannel.addSubscriber(subscriber1);
        firstChannel.addSubscriber(subscriber2);
        firstChannel.addSubscriber(subscriber4);
        firstChannel.addSubscriber(subscriber3);

        firstChannel.publishNewVideo("Title of Video");

        firstChannel.removeSubscriber(subscriber2);

        firstChannel.publishNewVideo("Title of a second video!"); // po usunięciu subscriber2
    }
}
