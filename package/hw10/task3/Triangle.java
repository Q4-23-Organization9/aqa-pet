package hw10.task3;

public class Triangle extends Shape{

    private double side1;
    private  double side2;
    private  double side3;
    private double vertexAX;
    private double vertexAY;
    private double vertexBX;
    private double vertexBY;
    private double vertexCX;
    private double vertexCY;



    public Triangle(String color, double vertexAX, double vertexAY, double vertexBX, double vertexBY, double vertexCX, double vertexCY) {
        super(color);
        this.vertexAX = vertexAX;
        this.vertexAY = vertexAY;
        this.vertexBX = vertexBX;
        this.vertexBY = vertexBY;
        this.vertexCX = vertexCX;
        this.vertexCY = vertexCY;
        this.side1 = calculateSide(vertexBX, vertexBY, vertexCX, vertexCY);
        this.side2 = calculateSide(vertexAX, vertexAY, vertexCX, vertexCY);
        this.side3 = calculateSide(vertexAX, vertexAY, vertexBX, vertexBY);
    }

    private double side;
    private double calculateSide(double coordinateX1, double coordinateY1, double coordinateX2, double coordinateY2) {
        side = Math.sqrt(Math.pow(coordinateX2 - coordinateX1, 2) + Math.pow(coordinateY2 - coordinateY1, 2));
        if (side <= 0) {
            System.out.println("Invalid side value. Side must be a positive number.");
            return Double.NaN;
        } else {
            return side;

        }
    }



    @Override
    protected void printInfo() {
        System.out.println("Triangle info: ");
        if(!(this.side1 + this.side2 > this.side3) || !(this.side2 + this.side3 > this.side1) || !(this.side1 + this.side3 > this.side2)) {
            System.out.println("This is not a valid triangle.");
        }
    }


    @Override
    protected double calculateArea() {

        if ((this.side1 + this.side2 > this.side3) && (this.side2 + this.side3 > this.side1) && (this.side1 + this.side3 > this.side2)) {
            double semiperimeter = (this.side1 + this.side2 + this.side3) / 2;
            // Формула Герона для вычисления площади треугольника:
            return Math.sqrt(semiperimeter * (semiperimeter - this.side1) * (semiperimeter - this.side2) * (semiperimeter - this.side3));
        } else {return Double.NaN;}
    }


    @Override
    protected double calculatePerimeter() {
        if((this.side1 + this.side2 > this.side3) && (this.side2 + this.side3 > this.side1) && (this.side1 + this.side3 > this.side2)) {
            return this.side1 + this.side2 + this.side3;             // Формула для вычисления периметра треугольника.
        } else {return Double.NaN;}
    }


    @Override
    protected void paint() {
        System.out.println("Painting Triangle  with color: " + color);
    }

}

