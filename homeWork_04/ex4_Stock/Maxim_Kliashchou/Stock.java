public class Stock {
    private String companyName;
    private double currentPrice;
    private double minimalPrice;
    private double maximalPrice;

    public Stock(String companyName, double currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimalPrice = currentPrice;
        this.maximalPrice = currentPrice;
    }

    public void updatePrice(double price){
        this.currentPrice = price;
        this.maximalPrice = Math.max(this.currentPrice, this.maximalPrice);
        this.minimalPrice = Math.min(this.currentPrice, this.minimalPrice);
    }

    public void printInformation(){
        System.out.println("Company = \"" + this.companyName +"\", Current Price = " + this.currentPrice +
                ", Min Price = " + this.minimalPrice + ", Max Price = " + this.maximalPrice);
    }

    public String printInformationTest(){
        return "Company = \"" + this.companyName +"\", Current Price = " + this.currentPrice +
                ", Min Price = " + this.minimalPrice + ", Max Price = " + this.maximalPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMinimalPrice() {
        return minimalPrice;
    }

    public double getMaximalPrice() {
        return maximalPrice;
    }

}
