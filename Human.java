package com.company;

import java.sql.SQLOutput;

public class Human {
public String name;
public int age;
public Human (String name, int age){
    this.name=name;
    this.age=age;
}
public void greed(){
    System.out.println("Hi! My name is "+name+", I'am "+age +" years old");
}
}
