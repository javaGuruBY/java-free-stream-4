public class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(5);
        Circle secondCircle = new Circle(3);

        System.out.println("Area of the first circle with radius = " + firstCircle.getRadius() + " is " + firstCircle.calculateArea());
        System.out.println("Area of the second circle with radius = " + secondCircle.getRadius() + " is " + secondCircle.calculateArea());

        firstCircle.setRadius(8);
        secondCircle.setRadius(15);

        System.out.println("Area of these two circles:");

        System.out.println("Area of the first circle with radius = " + firstCircle.getRadius() + " is " + firstCircle.calculateArea());
        System.out.println("Area of the second circle with radius = " + secondCircle.getRadius() + " is " + secondCircle.calculateArea());
    }
}
