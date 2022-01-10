package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(6);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}

    // Code from the previous exercise.

//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//    }

