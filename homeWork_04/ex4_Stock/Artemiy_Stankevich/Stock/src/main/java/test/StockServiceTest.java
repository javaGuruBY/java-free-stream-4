package test;

import bean.Stock;
import service.StockService;

public class StockServiceTest {
    StockService stockService = new StockService();


    public void currentPriceValueTest () {
        String testName = "Current price value Test";
        Stock stock = new Stock("Ford Motors", 1000);
        double expected = 1000;
        double actual = stock.getCurrentValue();
        testInformation(expected, actual, testName);
    }
    public void minPriceValueTest () {
        String testName = "Min price value Test";
        Stock stock = new Stock("Microsoft", 50);
        double expected = 50;
        double actual = stock.getMinCost();
        testInformation(expected, actual, testName);
    }
    public void maxPriceValueTest () {
        String testName = "Max price value Test";
        Stock stock = new Stock("From Software", 9999);
        double expected = 9999;
        double actual = stock.getMaxCost();
        testInformation(expected, actual, testName);
    }

    public void testInformation(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println("Test = " + testName + " has passed successfully");
        } else System.out.println(testName + " test failed. Expected '" + expected + "' but was '" + actual);
    }
}
