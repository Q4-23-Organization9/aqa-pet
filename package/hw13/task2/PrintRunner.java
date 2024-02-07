package hw13.task2;

import java.util.Arrays;

public class PrintRunner {

    public static void main(String[] args) {
        PrintableInterface[] printables = new PrintableInterface[]{ // не возможно было создать массив принтбл, хотел подвязаться под интерфейс (PrintableInterface)
                new Book("Effective Java", "Joshua Bloch"),
                new Magazine("Java Magazine", "Andrew Binstock")

        };

        Arrays.stream(printables).forEach(PrintableInterface::print);

    }


}
