package hw7;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] int_Array = new int[size];
        System.out.println("Enter elements of array: ");
        for (int j = 0; j < size; j++) { int_Array[j] = scanner.nextInt();}

        int max = int_Array[0];
        int min = int_Array[0];
        for ( int i = 1; i < size; i++) {
            if (int_Array[i] > max) {max = int_Array[i];}
            if (int_Array[i] < min ) {min = int_Array[i];}
        }
        if (max == min ) {
            System.out.println("All array elements are equal.");
        } else
        {
            System.out.println("max element = " + max);
            System.out.println("min element = " + min);
        }




    }
}
