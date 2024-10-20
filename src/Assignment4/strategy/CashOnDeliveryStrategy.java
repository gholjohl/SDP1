package Assignment4.strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderAmount) {
        return orderAmount + 300; // Плюс 300 рублей за доставку
    }
}
