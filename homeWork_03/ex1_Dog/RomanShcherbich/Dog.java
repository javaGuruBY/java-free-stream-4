public class Dog {
    public int age;
    public String color;
    public String name;

    public Dog(String name, int age, String color) {
      this.name = name;
      this.age = age;
      this.color = color;
      System.out.println("Dog '" + name + "' say hi to you!");
      System.out.println("You see " + color + " color dog " + age + " years old");
    }

    public void voice() {
      print("shouting");
    }

    public void eat() {
      print("eating");
    }

    public void sleep() {
      print("sleeping");
    }

    public void print(String action) {
      System.out.println(name + " is " + action);
    }
 }