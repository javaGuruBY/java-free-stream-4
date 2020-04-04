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

    public void voice() {
        System.out.println("Woff-Woff");
    }

    public void eat() {
        System.out.println("ham-ham");
    }

    public void sleep() {
        System.out.println("Hrr-r-r");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


