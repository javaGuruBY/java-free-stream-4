package Stock;

import org.junit.Assert;
import org.junit.Test;

public class StockTest {

  @Test
  public void initiateStockTest() throws Exception {
    Stock ford = new Stock("Ford motors", 5.0);
    Assert.assertEquals("Stock initiated with error!",
        "Stock Company = \"Ford motors\", Current Price = 5.0; Min Price = 5.0; Max Price = 5.0",
        ford.printInformation());
  }

  @Test
  public void minStockTest() throws Exception {
    Stock ford = new Stock("Ford motors", 5.0);

    ford.updatePrice(5.5);
    ford.updatePrice(4.5);

    Assert.assertEquals("Stock invalid min price logic!",
        "Stock Company = \"Ford motors\", Current Price = 4.5; Min Price = 4.5; Max Price = 5.5",
        ford.printInformation());
  }

  @Test
  public void maxStockTest() throws Exception {
    Stock ford = new Stock("Ford motors", 5.0);

    ford.updatePrice(4.5);
    ford.updatePrice(5.7);
    ford.updatePrice(5.9);

    Assert.assertEquals("Stock invalid max price logic!",
        "Stock Company = \"Ford motors\", Current Price = 5.9; Min Price = 4.5; Max Price = 5.9",
        ford.printInformation());
  }
}
