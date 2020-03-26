package Boris_Komarov;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int border = 21;
        int number1 = randomGenerator.nextInt(border);
        int number2 = randomGenerator.nextInt(border);
        int number3 = (int)(Math.random() * border);
        int sum = number1 + number2 + number3;

        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);
        System.out.println("Third number = " + number3);

        System.out.println("Sum = " + sum);
    }
}
