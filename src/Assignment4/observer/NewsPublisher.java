package Assignment4.observer;
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void publish(String category, String news);
}
