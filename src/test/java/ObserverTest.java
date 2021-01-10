
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;

public class ObserverTest {
    final YouTubeChannel channel1 = new YouTubeChannel();


    @Test
    public void should_Add_Subscriber() {
        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        channel1.addSubscriber(subscriber1);
        List<Observer> subscriberList = channel1.getSubscribers();
        assertThat(subscriberList, hasItem(subscriber1));

    }

    @Test
    public void should_Remove_Subscriber(){
        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        channel1.addSubscriber(subscriber1);
        channel1.removeSubscriber(subscriber1);
        List<Observer> subscriberList = channel1.getSubscribers();
        assertThat(subscriberList, hasItems());

    }

    @Test
    public void should_Notify_attached_Observer() {
        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        channel1.addSubscriber(subscriber1);
        channel1.publishNewVideo("video");

    }
}
