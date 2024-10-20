package Assignment4.strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderAmount) {
        return orderAmount * 1.02; // 2% комиссия
    }
}
