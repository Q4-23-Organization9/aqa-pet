package hw10.task3;

public class Rectangle extends Shape{

    private double width;
    private  double height;
    private double vertexAX;
    private double vertexAY;
    private double vertexBX;
    private double vertexBY;
    private double vertexCX;
    private double vertexCY;


    public Rectangle(String color, double vertexAX, double vertexAY, double vertexBX, double vertexBY, double vertexCX, double vertexCY) {
        super(color);
        this.vertexAX = vertexAX;
        this.vertexAY = vertexAY;
        this.vertexBX = vertexBX;
        this.vertexBY = vertexBY;
        this.vertexCX = vertexCX;
        this.vertexCY = vertexCY;
        this.width = calculateSideR(vertexBX, vertexBY, vertexCX, vertexCY);
        this.height = calculateSideR(vertexAX, vertexAY, vertexBX, vertexBY);
    }

    private double side;
    private double calculateSideR(double coordinateX1, double coordinateY1, double coordinateX2, double coordinateY2) {
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
        System.out.println("Rectangle info: ");
    }


    @Override
    protected double calculateArea() {
        if(this.width > 0 && this.height > 0) {
            return this.width * this.height;
        } else {return  Double.NaN;}
    }


    @Override
    protected double calculatePerimeter() {
        if (this.width > 0 && this.height > 0) {
            return 2 * (this.width + this.height);
        } else {return Double.NaN;}
    }


    @Override
    protected void paint() {
        System.out.println("Painting Rectangle with color: " + color);
    }

}