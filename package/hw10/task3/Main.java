package hw10.task3;

public class Main {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Red", 0.0, 0.0, 5.0, 0.0);
        shapes[1] = new Rectangle("Blue", 0.0, 0.0, 0.0, 2.0, 5.0, 2.0);
        shapes[2] = new Triangle("Green", 0.0, 0.0, 0.0, 2.0, 5.0, 2.0);

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
