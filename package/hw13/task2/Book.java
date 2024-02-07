package hw13.task2;

import java.util.Arrays;

public class Book implements PrintableInterface {


    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + "  " + "( " + author + " )");
    }


    public static void printBooks(PrintableInterface[] printables) {
        Arrays.stream(printables)
                .filter(printable -> printable instanceof Book)
                .forEach(PrintableInterface::print);
    }


}
