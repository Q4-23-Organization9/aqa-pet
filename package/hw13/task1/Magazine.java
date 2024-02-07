package hw13.task1;

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
        for (PrintableInterface printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }


}
