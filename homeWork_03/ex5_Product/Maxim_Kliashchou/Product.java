public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double actualPrice(){
        return this.regularPrice - (this.regularPrice * discount / 100);
    }

    public void printInformation(){
        System.out.println("Product : name = \"" + this.name
                + "\", regular price = " + this.regularPrice
                + " EUR, discount = " + this.discount
                + "%, actual price = " + this.actualPrice() + " EUR");
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
