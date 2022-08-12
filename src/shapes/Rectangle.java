package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2*length)+(2*width);
    }

    @Override
    public double getArea() {
        return length*width;
    }


//    protected int length;
//    protected int width;
//
////    Constructors//
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {
//
//    }
//
//
//    //    Getters and Setters//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
////    AREA AND PERIMETER
//    public int getArea() {
//        return length * width;
//
//    }
//    public int getPerimeter() {
//        return (2*length)+(2*width);
//
//    }
}
