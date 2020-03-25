public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice * (100 - discount) / 100;
    }

    void printInformation() {
        System.out.println("Product : name = " + name + ", regular price = " + regularPrice + " EUR, discount = " + discount + "%, actual price = " + actualPrice() + " EUR");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
