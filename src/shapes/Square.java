package shapes;

public class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }
}



// Code from the previous exercise. 1/7/22

//public class Square extends Rectangle {
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        System.out.println("This is a square.");
//        return Math.pow(length, 2);
//    }
//
//
//    public double getPerimeter() {
//        System.out.println("This is a square.");
//        return 4 * length;
//    }
//}
