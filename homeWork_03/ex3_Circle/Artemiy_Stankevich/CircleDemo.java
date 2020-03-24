public class CircleDemo {
    public static void main(String[] args) {
    
        Circle circle1 = new Circle();
        circle1.setRadius(2.22);
        System.out.println("Variable radius circle1 is equal to " + circle1.getRadius());
        System.out.println("The circle1 area through the default constructor is " + circle1.calculateArea());

        Circle circle2 = new Circle(3.25);
        System.out.println("Variable radius circle2 is equal to " + circle2.getRadius());
        System.out.println("Circle area through constructor with one argument " + circle2.calculateArea());
    }
}
