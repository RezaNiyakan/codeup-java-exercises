package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        System.out.println("This is a square.");
        return Math.pow(length, 2);
    }


    public double getPerimeter() {
        System.out.println("This is a square.");
        return 4 * length;
    }
}
