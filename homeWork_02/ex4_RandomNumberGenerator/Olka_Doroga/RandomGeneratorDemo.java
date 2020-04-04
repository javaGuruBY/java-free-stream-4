import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String [] args) {

        Random randomGenerator = new Random();
        int boundRandom1 = randomGenerator.nextInt(250);
        System.out.println("1: " + boundRandom1);
        int boundRandom2 = randomGenerator.nextInt(250);
        System.out.println("2: " + boundRandom2);
        int boundMath = (int) (Math.random()* 251);
        System.out.println("3: " + boundMath);

        int sum = boundRandom1 + boundRandom2 + boundMath;
        System.out.println("Sum = " + sum);
    }

}
