package hw9;

public class Triangle extends Shape{

    private double side1;
    private  double side2;
    private  double side3;




    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);

    }


    public  double getSide1() {
        return side1;
    }


    public void setSide1(double side1) {

        if (side1 <= 0) {
            System.out.println("Invalid side1 value. Side1 must be a positive number.");
        } else {
            this.side1 = side1;

        }
    }



    public  double getSide2() {
        return side2;
    }


    public void setSide2(double side2) {

        if (side2 <= 0) {
            System.out.println("Invalid side2 value. Side2 must be a positive number.");
        } else {
            this.side2 = side2;

        }
    }


    public  double getSide3() {
        return side3;
    }


    public void setSide3(double side3) {

        if (side3 <= 0) {
            System.out.println("Invalid side3 value. Side3 must be a positive number.");
        } else {
            this.side3 = side3;

        }
    }


    @Override
    protected void printInfo() {
        System.out.println("Triangle info: ");
        if(!(side1 + side2 > side3) || !(side2 + side3 > side1) || !(side1 + side3 > side2)) {
            System.out.println("This is not a valid triangle.");
        }
    }


    @Override
    protected double calculateArea() {

        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            double semiperimeter = (side1 + side2 + side3) / 2;
            // Формула Герона для вычисления площади треугольника:
            return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
        } else {return Double.NaN;}
    }


    @Override
    protected double calculatePerimeter() {
        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            return side1 + side2 + side3;             // Формула для вычисления периметра треугольника.
        } else {return Double.NaN;}
    }


    @Override
    protected void paint() {
        System.out.println("Painting Triangle  with color: " + color);
    }

}
