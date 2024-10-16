package Assignment3.chain_of_responsibility;

public class PaymentC extends PaymentHandler {
    private double balance = 1000;

    @Override
    public void handlePayment(double amount) {
        if (amount <= balance) {
            System.out.println("Оплачено с PaymentC");
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
