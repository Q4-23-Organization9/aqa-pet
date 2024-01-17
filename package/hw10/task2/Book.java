package hw10.task2;

public class Book implements PrintableInterface{

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

}
