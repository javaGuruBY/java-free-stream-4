package com.company;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt(11); //A
        int boundRandom = randomGenerator.nextInt(15); //B
        int bound1Random = randomGenerator.nextInt(15); //B


        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);
        System.out.println("bound1Random = " + bound1Random);

        int sum =  unboundRandom +  boundRandom + bound1Random;

        System.out.println ("sum = " +sum);
    }
}

/*
Описание:

        Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.

        Функциональные требования:

        1. Сгенерировать 3 случайных числа и вывести их на экран.
        2. Посчитать сумму этих чисел и вывести результат на экран.

        Нефункциональные требования:

        1. Класс с демонстрацией должен называться "RandomGeneratorDemo".
 */