package Assignment3.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        double purchaseAmount = 210;
        paymentA.handlePayment(purchaseAmount);
    }
}

