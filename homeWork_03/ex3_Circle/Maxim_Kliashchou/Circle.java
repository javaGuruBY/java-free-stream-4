public class Circle {
    private double radius;

    public Circle(double radius){
        this.setRadius(radius);
    }

    public double calculateArea(){
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
