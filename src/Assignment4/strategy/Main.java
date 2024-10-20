package Assignment4.strategy;

public class Main {
    public static void main(String[] args) {
        // Создание заказа с оплатой картой
        Order order = new Order(new CardPaymentStrategy());
        System.out.println("Цена с оплатой картой: " + order.calculateFinalPrice(1000));

        // Изменение стратегии на оплату кошельком
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Цена с оплатой кошельком: " + order.calculateFinalPrice(1000));

        // Изменение стратегии на наложенный платеж
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Цена с наложенным платежом: " + order.calculateFinalPrice(1000));
    }
}
