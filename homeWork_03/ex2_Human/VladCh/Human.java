public class Human {

   private String name;
   private int age;
    
   
public Human(String name, int age) {

        this.setName(name);
        this.setAge(age);
    
  }
   
public String getName() {
        return name;
    }
    
public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name is invalid");
        }
 
        this.name = name;
    }
   
public int getAge() {
        return age;
    }
    
public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("Age is invalid");
        }
 
        this.age = age;
    }

    void greet() {
        System.out.println("My name is " + getName() + " , I am " +  getAge() + " years old");
    }
}
