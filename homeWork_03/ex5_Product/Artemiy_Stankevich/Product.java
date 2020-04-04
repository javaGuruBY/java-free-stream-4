import java.io.Serializable;

public class Product  implements Serializable {
    private String name;
    private double regularPrice;
    private double discount;

    Product(){
    }
    Product(String name) {
        this.name = name;
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

    double actualPrice() {
        return regularPrice * (100 - discount) / 100;
    }
    void printInformation(){
        System.out.println("Product 'name' = " + getName() + ", regular price = " + getRegularPrice() +
                " EUR, discount = " + getDiscount() + "%, actual price = " + actualPrice() + " EUR");
    }
}
