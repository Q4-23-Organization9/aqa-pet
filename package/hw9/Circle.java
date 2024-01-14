package hw9;

public class Circle extends Shape{

    private double radius;




    public Circle(String color, double radius) {
        super(color);

        setRadius(radius);
    }


    public  double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {

        if (radius <= 0) {
            System.out.println("Invalid radius value. Radius must be a positive number.");
        } else {
            this.radius = radius;

        }
    }

    @Override
    protected void printInfo() {
        System.out.println("Circle info: ");
    }


    @Override
    protected double calculateArea() {
        if (radius > 0) {
            return Math.PI * radius * radius;
        } else { return Double.NaN;}
    }


    @Override
    protected double calculatePerimeter() {
        if (radius > 0) {
            return 2 * Math.PI * radius;
        } else {return  Double.NaN;}
    }


    @Override
    protected void paint() {
        System.out.println("Painting Circle with color: " + color);
    }

}
