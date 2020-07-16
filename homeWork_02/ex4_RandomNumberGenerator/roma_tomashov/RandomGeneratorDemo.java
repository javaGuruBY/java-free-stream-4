import java.util.Random;
public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int numb1 = randomGenerator.nextInt(5);
        int numb2 = randomGenerator.nextInt(5);
        int numb3 = randomGenerator.nextInt(5);
        System.out.println("First number = " + numb1);
        System.out.println("Second number = " + numb2);
        System.out.println("Third number = " + numb3);
        System.out.println("Sum of numbers = " + (numb1 + numb2 + numb3));
    }
}
