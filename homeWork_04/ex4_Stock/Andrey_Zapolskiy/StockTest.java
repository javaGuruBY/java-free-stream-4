public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("google", 20);
        google.updatePrice(21);
        google.updatePrice(14);
        google.updatePrice(7);
        google.printInformation();

        Stock apple = new Stock("apple", 56);
        apple.updatePrice(48);
        apple.updatePrice(21);
        apple.updatePrice(9);
        apple.printInformation();
    }
}