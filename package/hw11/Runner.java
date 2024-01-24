package hw11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Rock-Paper-Scissors Game");
            System.out.println("---------------------------");

            System.out.print("Enter Player 1 name: ");
            String player1Name = scanner.nextLine();

            System.out.print("Enter Player 2 name: ");
            String player2Name = scanner.nextLine();

            int rounds = readRounds(scanner);

            RockPaperScissorsGame game = new RockPaperScissorsGame(player1Name, player2Name);
            game.startGame(rounds);

        } catch (InputMismatchException e) {
            System.out.println("Input error. Please enter an integer.");

        } finally {
            scanner.close();
        }
    }

    private static int readRounds(Scanner scanner) {
        int rounds = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the number of rounds: ");

            try {
                rounds = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Input error. Please enter an integer.");
            } finally {
                scanner.nextLine();
            }
        }

        return rounds;
    }


}
