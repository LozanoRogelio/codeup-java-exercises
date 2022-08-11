package shapes;

public class Rectangle {
    protected int length;
    protected int width;

//    Constructors//


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }


    //    Getters and Setters//
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return (2*length)+(2*width);
    }
    public int getPerimeter() {
        return length * width;
    }
}
