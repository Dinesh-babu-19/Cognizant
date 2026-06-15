public class AdapterPatternTest {

    public static void main(String[] args) {

        // PayPal Payment
        PaymentProcessor payPalProcessor =
                new PayPalAdapter(new PayPalGateway());

        payPalProcessor.processPayment(1500);

        // Stripe Payment
        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        stripeProcessor.processPayment(2500);
    }
}