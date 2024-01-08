package hw8;

public class Calculator {

    public static int a = 2;
    public static int b = 0;
    public static int sum = 0;
    public static int difference = 0;
    public static int product = 0;
    public static double quotient = 0;


    public static void addition(int a, int b)
    {
        sum = a + b;
    }

    public static void printAddition()
    {
        addition(a, b);
        System.out.println("Sum: " + sum);
    }


    public static void subtraction(int a, int b)
    {
        difference = a - b;
    }

    public static void printSubtraction()
    {
        subtraction(a, b);
        System.out.println("Difference: " + difference);
    }


    public static void multiplication(int a, int b)
    {
        product = a * b;
    }

    public static void printMultiplication()
    {
        multiplication(a, b);
        System.out.println("Product: " + product);
    }


    public static void division(double a, double b)
    {
        if (b != 0)
        {
            quotient = a / b;
        } else
        {
            System.out.println("Cannot divide by zero");
            return;
        }
    }

    public static void printDivision()
    {
        division(a, b);
        if(b != 0) {
            System.out.println("Quotient: " + quotient);
        }
    }

}
