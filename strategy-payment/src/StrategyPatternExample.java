//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StrategyPatternExample {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(new CreditCardPayment("123-456-7890"));
        paymentProcessor.processPayment(5000);

        paymentProcessor.setPaymentStrategy(new PayPalPayment("tony.cho@gmail.com"));
        paymentProcessor.processPayment(10000);
    }

}