package CapNhatGiaStock;

public class StockMarketApp {
    public static void main(String[] args) {
        Stock stockA = new Stock("StockA", 100.0);
        Stock stockB = new Stock("StockB", 200.0);

        Investor investor1 = new Investor("Huy");
        Investor investor2 = new Investor("Khoa");

        stockA.addObserver(investor1);
        stockA.addObserver(investor2);
        stockB.addObserver(investor1);

        System.out.println("Updating stock prices...");
        stockA.setPrice(110.0);
        stockB.setPrice(190.0);
    }
}

