public class Stock {
    String companyName;
    int stockPrice;
    int minStockPrice;
    int maxStockPrice;
    int currentStockPrice;

    public  Stock(String companyName, int stockPrice) {
        this.companyName = companyName;
        this.stockPrice = stockPrice;
        this.maxStockPrice = stockPrice;
        this.minStockPrice = stockPrice;
    }

    public void updatePrice(int currentStockPrice) {
        this.currentStockPrice = currentStockPrice;

         if (currentStockPrice > stockPrice){
            this.maxStockPrice = currentStockPrice;
        } else if (currentStockPrice < stockPrice) {
            this.minStockPrice = currentStockPrice;
        } else if (maxStockPrice == currentStockPrice) {

         }
    }
    public void printInformation() {
        System.out.println("companyName:" +" "+  companyName
                + "\n" + "currentStockPrice :" +" "+ currentStockPrice
                + "\n" + "minStockPrice:" +" "+ minStockPrice
                +"\n" + "maxStockPrice:" +" "+ maxStockPrice);
    }
}
