public class Circle {

  private double radius;

  public Circle(double radius) {
    this.setRadius(radius);
  }
  
  public double getRadius() {
        return radius;
  }
    
  public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius is invalid");
        }
        
        this.radius = radius;
  }   

  public double calculateArea() {
  
    return Math.PI * this.radius * this.radius ;
    
  }
    
}
