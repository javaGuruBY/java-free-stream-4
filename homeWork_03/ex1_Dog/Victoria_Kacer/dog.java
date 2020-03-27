package com.company;

public class Dog {
    public String name;
    public String color;
    public int age;

    public boolean voice;
    public boolean eat;
    public boolean sleep;

    public void voiceOn() {
        this.voice = true;
    }
    public void voiceNo() {
        this.voice = false;
    }
    public void eatOn() {
        this.eat = true;
    }
    public void eatNo() {
        this.eat = false;
    }
    public void sleepOn() {
        this.sleep = true;
    }
    public void sleepNo() {
        this.sleep = false;
    }

}

package com.company;

public class DogDemo {
    public static void main(String[] args) {

        Dog bobik = new Dog();

        bobik.name = "Bobik";
        bobik.name = "black";
        bobik.age = 5;

        System.out.println("Dog`s name is " + bobik.name);
        System.out.println("His color is " + bobik.name);
        System.out.println("He is " + bobik.age +" years old");

        System.out.println("The dog is eating now");
        bobik.voiceNo();
        bobik.eatOn();
        bobik.sleepNo();

        System.out.println("Is the dog barking? " + bobik.voice);
        System.out.println("Is the dog eating now? " + bobik.eat);
        System.out.println("Is the dog sleeping? " + bobik.sleep);


    }
