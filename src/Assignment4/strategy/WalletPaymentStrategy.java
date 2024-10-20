package Assignment4.strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double orderAmount) {
        return orderAmount; // Без комиссии
    }
}
