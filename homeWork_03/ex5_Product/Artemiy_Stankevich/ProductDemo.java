public class ProductDemo {
    public static void main(String[] args) {
        Product console = new Product("PlayStation5");
        console.setDiscount(24);
        console.setRegularPrice(500);
        console.actualPrice();
        console.printInformation();
    }
}
