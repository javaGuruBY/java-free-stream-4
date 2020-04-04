package Stock;

public class Stock {

  private String companyName;
  private Double currentPrice;
  private Double minPrice;
  private Double maxPrice;

  public Stock(String companyName, Double currentPrice) throws Exception {
    if(currentPrice <= 0) {
      throw new Exception("ERROR price should be bigger than zero!");
    }
    this.companyName = companyName;
    this.currentPrice = currentPrice;
    this.minPrice = currentPrice;
    this.maxPrice = currentPrice;
  }

  public void updatePrice(Double price) {
    currentPrice = price;
    if(price < minPrice) {
      minPrice = price;
    }
    if(price > maxPrice) {
      maxPrice = price;
    }
  }

  public String printInformation() {
    return "Stock " +
        "Company = \"" + companyName + "\"" +
        ", Current Price = " + currentPrice +
        "; Min Price = " + minPrice +
        "; Max Price = " + maxPrice;
  }
}
