public class Product {

    String name;
    double regularPrice;
    double discount;
    double actualPrice;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public void actualPrice() {
        actualPrice = regularPrice * 0.80;
   }

   public void printInfo(){
        System.out.println("Name: " + name + ", Regular Price = "
                + regularPrice + ", Discount = " + discount
                + "%, Actual price = " + actualPrice + " ");
        }
}
