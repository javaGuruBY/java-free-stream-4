import java.io.Serializable;
class Human implements Serializable {
    String name;
    int age;
    Human () {
    }
    Human (String name, int age) {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "" ) this.name = name; else System.out.println("Error: variable name cannot be empty");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age; else System.out.println("Error: age cannot be negative or equal to zero");
    }
    void greet() {
        System.out.println("Hi! My name is " + getName() + " , I'm " +  getAge() + " years old");
    }
}

public class HumanDemo {
    public static void main(String[] args) {
        Human man = new Human();
        man.setName("Артемий");
        man.setAge(25);
        man.greet();
    }
}
