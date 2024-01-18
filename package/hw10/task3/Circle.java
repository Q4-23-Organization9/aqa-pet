package hw10.task3;

public class Circle extends Shape{

    private double radius;
    private double centerX;
    private double centerY;
    private double anotherAX;
    private double anotherAY;


    public Circle(String color, double centerX, double centerY, double anotherAX, double anotherAY) {
        super(color);
        this.centerX = centerX;
        this.centerY = centerY;
        this.anotherAX = anotherAX;
        this.anotherAY = anotherAY;
        this.radius = calculateRadius(centerX, centerY, anotherAX, anotherAY);
    }

    private double radiusNew;
    private double calculateRadius(double coordinateX1, double coordinateY1, double coordinateX2, double coordinateY2)
    {
        radiusNew = Math.sqrt(Math.pow(coordinateX2 - coordinateX1, 2) + Math.pow(coordinateY2 - coordinateY1, 2));
        if (radiusNew <= 0)
        {
            System.out.println("Invalid radius value. Radius must be a positive number.");
            return Double.NaN;
        } else
        {
            return radiusNew;

        }
    }



    @Override
    protected void printInfo() {
        System.out.println("Circle info: ");
    }


    @Override
    protected double calculateArea() {
        if (this.radius > 0) {
            return Math.PI * this.radius * this.radius;
        } else { return Double.NaN;}
    }


    @Override
    protected double calculatePerimeter() {
        if (this.radius > 0) {
            return 2 * Math.PI * this.radius;
        } else {return  Double.NaN;}
    }


    @Override
    protected void paint() {
        System.out.println("Painting Circle with color: " + color);
    }

}