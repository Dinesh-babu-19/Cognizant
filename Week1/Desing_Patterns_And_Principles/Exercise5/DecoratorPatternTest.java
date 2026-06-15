public class DecoratorPatternTest {

    public static void main(String[] args) {

        System.out.println("=== Email Notification ===");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Your order has been shipped.");

        System.out.println();

        System.out.println("=== Email + SMS Notification ===");
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        smsNotifier.send("Your order has been shipped.");

        System.out.println();

        System.out.println("=== Email + SMS + Slack Notification ===");
        Notifier multiChannelNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        multiChannelNotifier.send("Your order has been shipped.");
    }
}