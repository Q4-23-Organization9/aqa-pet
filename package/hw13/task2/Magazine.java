package hw13.task2;

import java.util.Arrays;

public class Magazine implements PrintableInterface {

    private String title;
    private String editor;

    public Magazine(String title, String editor) {
        this.title = title;
        this.editor = editor;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title + "  " + "( " + editor + " )");
    }


    public static void printMagazines(PrintableInterface[] printables) {
        Arrays.stream(printables)
                .filter(printable -> printable instanceof Magazine)
                .forEach(PrintableInterface::print); // Вызов метода print через ссылку на метод
    }

}
