package bean;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    private void setAge(int age){
        this.age = age;
    }

    private void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
