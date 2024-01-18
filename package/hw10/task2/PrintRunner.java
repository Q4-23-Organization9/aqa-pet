package hw10.task2;

public class PrintRunner {

    public static void main(String[] args) {
        PrintableInterface[] printables = new PrintableInterface[]{ // не возможно было создать массив принтбл, хотел подвязаться под интерфейс (PrintableInterface)
                new Book("Effective Java", "Joshua Bloch"),
                new Magazine("Java Magazine", "Andrew Binstock")

        };

        for (PrintableInterface printable : printables) {
            printable.print();
        }
    }

}
