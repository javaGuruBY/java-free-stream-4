import java.util.Random;

public class RandomGeneratorDemo {

  public static void main(String[] args) {
    int number1 = randomInt(100);
    int number2 = randomInt(100);
    int number3 = randomInt(100);

    System.out.println("Sum = " + (number1 + number2 + number3));
  }

  public static int randomInt(int chars) {
    Random randomGenerator = new Random();
    int result = randomGenerator.nextInt(chars);
    System.out.println("Random integer = " + result);
    return result;
  }

}
