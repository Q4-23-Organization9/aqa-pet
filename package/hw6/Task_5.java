package hw6;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.next();

        int len = word.length();
        if (len % 2 == 0){
            int let = len/2;
            System.out.println(word.substring(let-1, let+1));

        } else {
            System.out.println("wrong word");
        }



    }
}
