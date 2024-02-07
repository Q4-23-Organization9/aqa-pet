package hw12.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class DuplicateRemover {

    private ArrayList<Integer> numbers;
    private ArrayList<Integer> uniqueNumbers;


    public DuplicateRemover() {
        numbers = new ArrayList<>();
        uniqueNumbers = new ArrayList<>();
    }


    public void generateAndRemoveDuplicates() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(41) - 20;
            numbers.add(randomNumber);
        }

        uniqueNumbers = new ArrayList<>(numbers);
        Collections.sort(uniqueNumbers);

        int index = 0;

        while (index < uniqueNumbers.size() - 1) {
            if (uniqueNumbers.get(index).equals(uniqueNumbers.get(index + 1))) {
                uniqueNumbers.remove(index);
            } else {
                index++;
            }
        }
    }


    public void printResults() {
        System.out.println("Original collection:");
        System.out.println(numbers);
        System.out.println("Collection without duplicates:");
        System.out.println(uniqueNumbers);
        // Вычисляем количество удаленных дубликатов
        int removedDuplicates = numbers.size() - uniqueNumbers.size();
        System.out.println("Number of removed duplicates: " + removedDuplicates);
    }


}
