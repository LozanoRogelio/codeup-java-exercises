package shapes;

public class Square extends Rectangle {

        public static void main(String[] args) {

        }


            private int side;

        public Square( int side){
//            super takes rectangle length and width...turns them into sides
                super(side,side);
//                this.length = side;
//                this.width = side;
                this.side = side;

        }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side*side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }
}
