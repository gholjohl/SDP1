package Assignment3.chain_of_responsibility;

public class PaymentA extends PaymentHandler {
    private double balance = 100;

    @Override
    public void handlePayment(double amount) {
        if (amount <= balance) {
            System.out.println("Оплачено с PaymentA");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}
