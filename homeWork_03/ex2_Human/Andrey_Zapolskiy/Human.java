package lv.javaguru.demo;

public class Human {
    public String name;
    public int age;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;

    }
    public void greet() {
        System.out.println("Hi! My name is " + name + " , I'm " + age + " years old");
    }
}
