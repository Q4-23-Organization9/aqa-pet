package hw8;

public class Calculator {


    public static void addition(double a, double b)
    {
        double sum = a + b;
        System.out.println("Sum: " + sum);
    }


    public static void subtraction(double a, double b)
    {
        double difference = a - b;
        System.out.println("Difference: " + difference);
    }

    public static void multiplication(double a, double b)
    {
        double product = a * b;
        System.out.println("Product: " + product);
    }


    public static void division(double a, double b)
    {
        if (b != 0)
        {
           double quotient = a / b;
           System.out.println("Quotient: " + quotient);
        } else
        {
            System.out.println("Cannot divide by zero");
        }
    }

}
