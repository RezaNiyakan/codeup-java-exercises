package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}



// Code from the previous exercise.

//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//}


    //    perimeter = 2 x length + 2 x width
//    area = length x width

