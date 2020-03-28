import java.util.Random;
public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int boundRandom1 = randomGenerator.nextInt(100);
        int boundRandom2 = randomGenerator.nextInt(100);
        int boundRandom3 = randomGenerator.nextInt(100);
        System.out.println("boundRandom1 = " + boundRandom1);
        System.out.println("boundRandom2 = " + boundRandom2);
        System.out.println("boundRandom3 = " + boundRandom3);
        int sum = boundRandom1 + boundRandom2 + boundRandom3;
        System.out.println("sum = " + sum);
    }
}
