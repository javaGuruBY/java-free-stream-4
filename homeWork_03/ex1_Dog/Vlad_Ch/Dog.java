public class Dog {

private int age;
private String color;
private String name;
    
    
public Dog(String name, int age, String color) {

     this.age = age;
     this.color = color;
     this.name = name;   
     
     System.out.println("You add a new dog with name " + name +
     
                        "dog coat is " + color + " color " + 
                        
                        "He/She at " + age + " years of age " );
     
    }
    
public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name is invalid");
        }
 
        this.name = name;
    }
 
public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("Age is invalid");
        }
 
        this.age = age;
    }
    
public void setName(String color) {
        if (color == null || color.equals("")) {
            throw new IllegalArgumentException("Name is invalid");
        }
 
        this.color = color;
    }
    

  public void voice() {
      print("barking");
    }

  public void eat() {
      print("eating");
    }

  public void sleep() {
     print("sleeping");
    }
    
 }
