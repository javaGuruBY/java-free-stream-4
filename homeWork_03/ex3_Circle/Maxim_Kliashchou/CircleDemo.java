public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.6);

        System.out.println("Area of circle = " + circle.calculateArea());

        circle.setRadius(10.1);
        System.out.println("Area of circle with radius = " + circle.calculateArea());
    }
}
