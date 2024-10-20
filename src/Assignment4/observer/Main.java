package Assignment4.observer;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisherImpl(); // Создание издателя новостей

        // Создание подписчиков
        Observer smartphone = new NewsSubscriberSmartphone();
        Observer laptop = new NewsSubscriberLaptop();
        Observer tablet = new NewsSubscriberTablet();

        // Подписка на новости
        publisher.subscribe(smartphone);
        publisher.subscribe(laptop);
        publisher.subscribe(tablet);

        // Публикация новостей
        publisher.publish("Sport", "Футбольный матч завершился.");
        publisher.publish("Science", "Новая теория относительности.");
    }
}
