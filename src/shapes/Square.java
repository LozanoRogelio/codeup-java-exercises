package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }
    @Override
    public void setWidth(double width) {
        this.length = this.width = width;
    }


//
//        public static void main(String[] args) {
//
//        }
//
//
//            private int side;
//
//        public Square( int side){
////            super takes rectangle length and width...turns them into sides
//                super(side,side);
////                this.length = side;
////                this.width = side;
//                this.side = side;
//
//        }
//
//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//
//    }
//
//    @Override
//    public int getArea() {
//        return side*side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
