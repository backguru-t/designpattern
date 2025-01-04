public class PaymentProcessor {

    Payable paymentStrategy;

    public void setPaymentStrategy(Payable paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        if (paymentStrategy == null) {
            System.out.println("no way to pay");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
