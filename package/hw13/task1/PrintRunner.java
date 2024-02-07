package hw13.task1;

public class PrintRunner {

    public static void main(String[] args) {
        PrintableInterface[] printables = new PrintableInterface[]{
                new Book("Effective Java", "Joshua Bloch"),
                new Magazine("Java Magazine", "Andrew Binstock")

        };

        for (PrintableInterface printable : printables) {
            printable.print();
        }

        PrintableInterface.printableLambda.print();
    }


}
