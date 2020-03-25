public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 2, 20);

        milk.printInformation();

        milk.setDiscount(50);
        milk.setRegularPrice(4);

        System.out.println("Information about milk after changes:");

        milk.printInformation();
    }
}
