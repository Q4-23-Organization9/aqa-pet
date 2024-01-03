package hw7;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.next();

        char[] chars = word.toCharArray();

        int counter = 0;
        for (int i = 0; i < chars.length/2; i++)
        {

            if ( chars[i] != chars[chars.length -(i+1)])
            {
                System.out.println(chars[i] + " != " + chars[chars.length -(i+1)]);
                System.out.println("This word is not a palindrome");
                break;
            } else
            {
                System.out.println(chars[i] + " = " + chars[chars.length -(i+1)]);
                counter ++;
            }
        }
        if (counter == chars.length/2) {
            System.out.println("This word is a palindrome");
        }

    }
}
