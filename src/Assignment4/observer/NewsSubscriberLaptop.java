package Assignment4.observer;
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if ("Science".equals(category)) {
            System.out.println("Laptop: Новость по науке - " + news);
        }
    }
}
