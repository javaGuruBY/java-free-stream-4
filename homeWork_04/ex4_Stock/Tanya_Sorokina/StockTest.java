public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE", 90);
        google.updatePrice(56);
        google.updatePrice(15);
        google.updatePrice(118);
        google.printInformation();

        Stock samsung = new Stock("Samsung", 56);
        samsung.updatePrice(30);
        samsung.updatePrice(70);
        samsung.updatePrice(15);
        samsung.printInformation();
    }
}
