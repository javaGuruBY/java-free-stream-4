import java.io.Serializable;

public class Circle implements Serializable {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius; 
        else System.out.println("The radius property cannot be less than zero");
    }
    Circle() {
    }
    Circle(double rad) {
        if (rad > 0) this.radius = rad; 
        else System.out.println("The radius property cannot be less than zero");
    }
    public  double calculateArea() {
        return this.radius * this.radius * 3.14 ;
    }
}
