package Assignment4.strategy;

public class Order {
    private PaymentStrategy paymentStrategy; // Текущая стратегия оплаты

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Установка стратегии оплаты
    }

    public double calculateFinalPrice(double orderAmount) {
        // Расчет итоговой стоимости заказа
        return paymentStrategy.calculateFinalPrice(orderAmount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Изменение стратегии оплаты
    }
}
