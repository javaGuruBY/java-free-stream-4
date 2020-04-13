package com.company;

public class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
       this.name = name;
       this.age = age;
    }
    public void greet() {

        System.out.println("Hello! My name is " + name + " I`m " + age + " years old");
    }
}

import com.company.Human;

public class HumanDemo {
    public static void main (String[] args) {
        Human Victor = new Human("Victor",15);

        Victor.greet();

    }
}
