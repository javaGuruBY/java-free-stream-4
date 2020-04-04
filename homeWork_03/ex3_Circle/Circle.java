public class Circle {
    public double radius;
    public double squareCircle;
    public Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        squareCircle = 3.14 * (radius * radius);
        System.out.println(squareCircle);
    }
}
