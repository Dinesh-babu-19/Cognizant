public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Dinesh");
        Observer webUser = new WebApp("Rahul");

        // Register observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // Update stock prices
        stockMarket.setStockPrice("TCS", 4250.50);

        stockMarket.setStockPrice("Infosys", 1580.75);

        // Remove one observer
        stockMarket.deregisterObserver(webUser);

        System.out.println("\nWeb user unsubscribed.");

        stockMarket.setStockPrice("Wipro", 290.25);
    }
}