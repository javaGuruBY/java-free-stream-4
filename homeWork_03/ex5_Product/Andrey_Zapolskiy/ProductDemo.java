package lv.javaguru.demo;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("milk", 20, 16);
        milk.printInformation();

        Product icecream = new Product("icecream", 3, 20);
        icecream.printInformation();

    }
}
