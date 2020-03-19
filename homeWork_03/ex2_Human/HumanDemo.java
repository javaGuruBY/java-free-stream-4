public class HumanDemo {

  public static void main(String[] args) {
    Human tuzik = new Human("Vova Putin", 2);

    tuzik.greed();
  }

  public static class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public void greed() {
      System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
  }
}
