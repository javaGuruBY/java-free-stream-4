import bean.Stock;
import service.StockService;
import test.StockServiceTest;

public class StockServiceDemo {
    public static void main(String[] args) throws Exception {
        StockService stockService = new StockService();
        Stock GOOGLE = new Stock("Google", 150);
        stockService.printInformation(GOOGLE);
        stockService.updatePrice(GOOGLE,100);
        stockService.updatePrice(GOOGLE,500);
        stockService.updatePrice(GOOGLE,176);
        stockService.printInformation(GOOGLE);

          StockServiceTest stockServiceTest = new StockServiceTest();
          stockServiceTest.currentPriceValueTest();
          stockServiceTest.minPriceValueTest();
          stockServiceTest.maxPriceValueTest();

    }
}
