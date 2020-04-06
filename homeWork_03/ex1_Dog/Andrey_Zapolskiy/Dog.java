package lv;

public class Dog {
    public int age;
    public String color;
    public String name;

    Dog(String x, String y, int z) {
        name = x;
        color = y;
        age = z;
    }

    void voice() {
        System.out.println("Gav");
    }
    void eat() {
        System.out.println("Хрум");
    }
    void sleep() {
        System.out.println("Хрр");
    }
}
