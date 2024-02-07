package hw13.task1;

public interface PrintableInterface {

    void print();


    PrintableInterface printableLambda = () -> {
        System.out.println("Printing from lambda!");
    };


}
