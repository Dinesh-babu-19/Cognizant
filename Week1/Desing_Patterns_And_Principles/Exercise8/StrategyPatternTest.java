public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(
                new CreditCardPayment("1234567890123456"));

        context.executePayment(5000);

        // Change strategy at runtime
        context.setPaymentStrategy(
                new PayPalPayment("dinesh@example.com"));

        context.executePayment(2500);
    }
}