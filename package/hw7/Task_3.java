package hw7;

import java.util.Arrays;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] int_Array = new int[size];
        System.out.println("Enter elements of array: ");
        for (int j = 0; j < size; j++) { int_Array[j] = scanner.nextInt();}

        for ( int i = 0; i < size; i++) {
            if (int_Array[i] % 2 == 0) {int_Array[i] = 0;}
            System.out.println(int_Array[i]);                   // первый вариант вывода элементов получившегося массива
            }
        String secondArray = Arrays.toString(int_Array);       // второй вариант вывода получившегося массива ( в одну строку)
        System.out.println("This is a new array: " + secondArray);

    }
}
