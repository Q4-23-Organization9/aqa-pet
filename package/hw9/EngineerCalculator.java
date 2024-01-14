package hw9;

public class EngineerCalculator extends Calculator {

    public EngineerCalculator(double a, double b) {
        super(a, b);
    }

    public double getA() {
        return this.a;
    }


    public double sin() {
        return Math.sin(a);
    }

    public double cos() {
        return Math.cos(a);
    }


    public double tan() {
        return Math.tan(a);
    }

    public double cot() {

        double tanValue = Math.tan(a);
        if (tanValue != 0) {
            return 1 / tanValue;
        } else {
            System.out.println("Cotangent is undefined.");
            return Double.NaN;
        }
    }

    @Override
    protected double add() {
        return a + b;
    }

    @Override
    protected double subtract() {
        return a - b;
    }


    @Override
    protected double multiply() {
        return a * b;
    }

    @Override
    protected double divide() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }

    @Override
    protected void printInfo() {
        System.out.println("--------------------------------------------------------");
        System.out.println("EngineerCalculator info: ");
    }
}
