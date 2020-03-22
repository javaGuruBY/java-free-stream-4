package com.company;

public class MathOperationsDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations'!");

        int a = 100;
        int b = 45;

        System.out.println("1) Addition '+':"); // 1
        System.out.print("a = ");               // 2
        System.out.print(a);                    // 3
        System.out.print(", ");                 // 4
        System.out.print("b = ");               // 5
        System.out.print(b);                    // 6

        int sum = a + b;// 1

        System.out.println();// 2
        System.out.print("a + b = ");// 3
        System.out.print(a);// 4
        System.out.print(" + ");// 5
        System.out.print(b);// 6
        System.out.print(" = ");// 7
        System.out.println(sum); // 8

        System.out.println("2) Subtraction '-':");

        long x = 40;
        long y = 18;

        System.out.println("x = " + x + ", y = " + y); // 1

        long difference = x - y;
        System.out.println("x - y = " + x + " - " + y + " = " + difference);

        System.out.println("3) Division '/':");

        short m = 15;
        short n = 3;

        System.out.println("m = " + m + ", n = " + n);

        System.out.println("m / n = " + m + " / " + n + " = " + (15 / 3)); // 1
        System.out.println("4) Multiplication '*':");
        short c = 15;
        short d = 3;
        System.out.println("c = " + c+ ", d = " + d);

        System.out.println("c * d = " + c+ " * " + d + " = " + (c * d)); // 1
    }
}
