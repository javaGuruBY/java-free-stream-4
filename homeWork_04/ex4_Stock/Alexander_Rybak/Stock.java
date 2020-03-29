public class Stock {
    private int currentPrice;
    private int minPrice;
    private int maxPrice;
    private String companyName;

    public Stock(String companyName, int currentPrice) {
        this.currentPrice = currentPrice;
        this.companyName = companyName;
        this.minPrice = this.maxPrice = currentPrice;
    }

    public void printInformation() {
        System.out.println("Company = \"" + getCompanyName() + "\", Current Price = " + getCurrentPrice()
                + ", Min Price = " + getMinPrice() + ", Max Price = " + getMaxPrice());
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void updatePrice(int price) {
        if (price < getMinPrice()) setMinPrice(price);
        else if (price > getMaxPrice()) setMaxPrice(price);
        setCurrentPrice(price);
    }
}
