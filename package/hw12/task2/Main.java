package hw12.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);
        numbers.add(6);


        System.out.println("Original list:");
        System.out.println(numbers);


        Partition partition = new Partition();


        partition.partition(numbers, 5);


        System.out.println("List after rearrangement:");
        System.out.println(numbers);
    }


}
