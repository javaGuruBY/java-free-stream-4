public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI*radius*radius;
        System.out.println("Circle area = " + area);
        return area;
    }
}
