package login;

public class ProductDemo {

  public static void main(String[] args) {
    Product product = new Product("gorenie 150D");
    product.setRegularPrice(100);
    product.setDiscount(25);

    product.printInformation();
  }
}
