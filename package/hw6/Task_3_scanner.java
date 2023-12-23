package hw6;
import java.util.Scanner;
public class Task_3_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int var1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int var2 = scanner.nextInt();

        int absVar1 = Math.abs(var1);
        int absVar2 = Math.abs(var2);

        if (absVar1 >= absVar2 ){
            if (absVar1 == absVar2){
                System.out.println("Both numbers have the same absolute value.");
            } else {
                System.out.println("Number "+var1+" has a greater absolute value than number "+var2+ ".");
            }

        } else {
            System.out.println("Number "+var1+" has a smaller absolute value than number "+var2+" .");
        }

    }
}
