import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt(); //a
        int boundRandom = randomGenerator.nextInt(20);
        int boundRandom2 = randomGenerator.nextInt(100);

        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom =" + boundRandom);
        System.out.println("boundRandom2 =" + boundRandom2);

        int sum = unboundRandom + boundRandom + boundRandom2;

        System.out.println("sum =" + sum);

    }
}
