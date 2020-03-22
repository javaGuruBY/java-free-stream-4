public class DogDemo implements java.io.Serializable {
    public static void main(String[] args) {
        Dog german_shepherd = new Dog("Era", 6, "black");
        System.out.println("Name my dog is - " + german_shepherd.getName());
        System.out.println("Age my dog is - " + german_shepherd.getAge());
        System.out.println("Color my dog is - " + german_shepherd.getColor());
        german_shepherd.voice();
        german_shepherd.eat();
        german_shepherd.sleep();
    }
}
class Dog {
    private String name;
    private int age;
    private String  color;
    Dog () {
    }
    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    public void setName(String name) {
        if (name != "") this.name = name; else System.out.println("Ошибка: Собака должна быть с именем");
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age; else System.out.println("Ошибка: возраст собаки не может быть отрицательным");
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        if (color != "") this.color = color; else System.out.println("Ошибка: собака не может быть безцветной");
    }
    public String getColor() {
        return color;
    }

    void voice() {
        System.out.println("Гав-Гав-Гав");
    }
    void eat() {
        System.out.println("Ням-Ням-ням");
    }
    void sleep() {
        System.out.println("Хрр-р-р-р-рап");
    }
}
