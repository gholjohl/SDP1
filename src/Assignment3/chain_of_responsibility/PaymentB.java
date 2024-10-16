package Assignment3.chain_of_responsibility;

public class PaymentB extends PaymentHandler {
    private double balance = 300;

    @Override
    public void handlePayment(double amount) {
        if (amount <= balance) {
            System.out.println("Оплачено с PaymentB");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}
