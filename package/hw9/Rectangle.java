package hw9;

public class Rectangle extends Shape{

    private double width;
    private  double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        setWidth(width);
        setHeight(height);
    }


    public  double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width <= 0) {
            System.out.println("Invalid width value. Width must be a positive number.");
        } else {
            this.width = width;

        }
    }


    public  double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if (height <= 0) {
            System.out.println("Invalid height value. Height must be a positive number.");
        } else {
            this.height = height;

        }
    }


    @Override
    protected void printInfo() {
        System.out.println("Rectangle info: ");
    }


    @Override
    protected double calculateArea() {
        if(width > 0 && height > 0) {
            return width * height;
        } else {return  Double.NaN;}
    }


    @Override
    protected double calculatePerimeter() {
        if (width > 0 && height > 0) {
            return 2 * (width + height);
        } else {return Double.NaN;}
    }


    @Override
    protected void paint() {
        System.out.println("Painting Rectangle with color: " + color);
    }

}
