package shapes;

public class Circle {
    private double radius;
    private final double PI = Math.PI;


    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * (radius*radius);
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }






//Constructors
    public Circle(double radius) {
        this.radius = radius;
    }
}
