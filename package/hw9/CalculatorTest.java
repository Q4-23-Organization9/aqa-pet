package hw9;

public class CalculatorTest {

    public static void main(String[] args) {
        testCalculator();
    }

    private static void testCalculator() {


        ProgrammableCalculator programmableCalculator = new ProgrammableCalculator(1.0, 6.0);
        programmableCalculator.printInfo();

        programmableCalculator.toBinary();

        double resultAdd = programmableCalculator.add();
        System.out.println("Result of addition: " + resultAdd);

        double resultSubtract = programmableCalculator.subtract();
        System.out.println("Result of addition: " + resultSubtract);

        double resultMultiply = programmableCalculator.multiply();
        System.out.println("Result of subtract: " + resultMultiply);

        double resultDivide = programmableCalculator.divide();
        System.out.println("Result of divide: " + resultDivide);




        EngineerCalculator engineerCalculator = new EngineerCalculator(45, 90);
        engineerCalculator.printInfo();

        double resultSin = engineerCalculator.sin();
        System.out.println("sin" + "(" + engineerCalculator.getA() + "): " + resultSin);

        double resultCos = engineerCalculator.cos();
        System.out.println("cos" + "(" + engineerCalculator.getA() + "): " + resultCos);

        double resultTan = engineerCalculator.tan();
        System.out.println("tan" + "(" + engineerCalculator.getA() + "): " + resultTan);

        double resultCot = engineerCalculator.cot();
        System.out.println("cot" + "(" + engineerCalculator.getA() + "): " + resultCot);

        double resAdd = engineerCalculator.add();
        System.out.println("Result of addition: " + resAdd);

        double resSubtract = engineerCalculator.subtract();
        System.out.println("Result of addition: " + resSubtract);

        double resMultiply = engineerCalculator.multiply();
        System.out.println("Result of subtract: " + resMultiply);

        double resDivide = engineerCalculator.divide();
        System.out.println("Result of divide: " + resDivide);
    }

}
