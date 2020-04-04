package com.company;

public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle=new Circle();
        myCircle.radius = 5;
        myCircle.area = Math.PI*myCircle.radius*myCircle.radius;
        myCircle.calculateArea();
    }
}
