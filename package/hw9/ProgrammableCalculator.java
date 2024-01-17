package hw9;

public class ProgrammableCalculator extends Calculator {


    public ProgrammableCalculator(double a, double b) {
        super(a, b);
    }


    public void toBinary() {
        String binaryResult = convertToBinary(add());
        System.out.println("Result in binary: " + binaryResult);
    }

    private String convertToBinary(double number) {
        return Integer.toBinaryString((int) number);
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
        System.out.println("ProgrammableCalculator info: ");
    }
}
