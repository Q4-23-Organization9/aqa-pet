package hw6;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the variable value: ");
        int number = scanner.nextInt();

        String checkOddEven = ( number % 2 != 0 ) ? "Odd number" : "Even number";
        System.out.println(checkOddEven);
        System.out.println("BYE");

    }
}
