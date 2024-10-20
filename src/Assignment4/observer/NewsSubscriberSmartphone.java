package Assignment4.observer;
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if ("Sport".equals(category)) {
            System.out.println("Smartphone: Новость по спорту - " + news);
        }
    }
}
