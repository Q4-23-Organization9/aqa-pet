package hw9;

public abstract  class Calculator {

    protected double a;
    protected double b;


    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected abstract void printInfo();
    protected abstract double add();
    protected abstract double subtract();
    protected abstract double multiply();
    protected abstract double divide();

}
