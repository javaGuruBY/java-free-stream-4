public class Dog {
    public int age;
    public String color;
    public String name;

    public Dog(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    void printInfo(){
        System.out.println(name + " " + age + " " + color);
    }
    void voice() {
        System.out.println("Aff");
    }
    void eat() {
        System.out.println("Ham");
    }
    void sleep() {
        System.out.println("Hhrrr");
    }
}
