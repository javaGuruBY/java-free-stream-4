public class DogDemo{
    public static void main(String[] args) {
        Dog Dog1 = new Dog(3,"black","Afiya");
        Dog Dog2 = new Dog(1, "green","Eva");

        Dog1.sleep();
        Dog1.printInfo();
        Dog2.printInfo();
        Dog2.eat();

    }
}

