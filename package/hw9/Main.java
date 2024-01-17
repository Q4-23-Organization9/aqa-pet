package hw9;

public class Main {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Red", 2.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Triangle("Green", 3.0, 1.0, 5.0);

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("HashCode: " + shape.hashCode());
            System.out.println("ToString: " + shape.toString());
            System.out.println("-------------");
        }


    }

}
