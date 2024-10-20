package Assignment4.observer;
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Tablet: Новость - " + news);
    }
}
