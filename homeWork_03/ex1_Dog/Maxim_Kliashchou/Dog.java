public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name){
        this.setAge(age);
        this.setColor(color);
        this.setName(name);
    }

    public void voice(){
        System.out.println(this.getName() + ": Woof-woof-woof");
    }

    public void eat(){
        System.out.println(this.getName() + ": Om nom nom");
    }

    public void sleep(){
        System.out.println(this.getName() + ": Z-z-z-z-z-z");
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Age: " + this.getAge() + " Color: " + this.getColor() + " Name: " + this.getName();
    }
}
