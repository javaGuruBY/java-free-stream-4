package com.company;

public class Circle {

    public double radius;
    public double pi;
    public double calculateArea() {
        return this.pi * this.radius * this.radius;
    }
}

package com.company;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.radius = 4;
        circle.pi = 3.14;
        double s = circle.calculateArea();
        System.out.println("The aria of the circle is " + s);
    }
}
