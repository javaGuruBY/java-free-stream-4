

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
                int boundRandomOne = randomNumberGenerator.nextInt(13);
                int boundRandomTwo = randomNumberGenerator.nextInt(10);
                int boundRandomTree = randomNumberGenerator.nextInt(14);

                System.out.println("boundRandomOne =" + boundRandomOne );
                System.out.println("boundRandomTwo =" + boundRandomTwo);
                System.out.println("boundRandomTree =" + boundRandomTree);

                int sum = boundRandomOne + boundRandomTwo + boundRandomTree;


