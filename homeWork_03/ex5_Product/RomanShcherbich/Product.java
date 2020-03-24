package login;

public class Product {

  String name;

  public Product(String name) {
    this.name = name;
  }

  double regularPrice;
  double discount;

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double actualPrice() {
    double actualPrice = regularPrice * discount / 100;
    System.out.println("actualPrice = " + actualPrice + "$");
    return actualPrice;
  }

  public void printInformation() {
    System.out.println("Product: " +
        "name='" + name + '\'' +
        ", regularPrice = " + regularPrice + "$" +
        ", discount = " + discount + "%" +
        ", actualPrice = " + actualPrice() + "$");
  }

}
