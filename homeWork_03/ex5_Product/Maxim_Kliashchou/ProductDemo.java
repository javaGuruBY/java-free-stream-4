public class ProductDemo {
    public static void main(String[] args) {
        Product productOne = new Product("Beer", 2, 20);
        Product productTwo = new Product("Snacks", 1.5, 5);

        productOne.printInformation();
        productTwo.printInformation();
    }
}
