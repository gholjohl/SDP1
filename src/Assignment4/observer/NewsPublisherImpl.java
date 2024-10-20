package Assignment4.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> observers = new ArrayList<>(); // Список подписчиков

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer); // Добавление подписчика
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer); // Удаление подписчика
    }

    @Override
    public void publish(String category, String news) {
        // Уведомление подписчиков о новой новости
        for (Observer observer : observers) {
            observer.update(category, news);
        }
    }
}
