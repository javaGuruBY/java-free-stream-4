package lv;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("собака", "желтая", 7);
        System.out.println(myDog.age + " "+ myDog.color+ " "+myDog.name);
        myDog.voice();
        myDog.eat();
        myDog.sleep();
    }
}
