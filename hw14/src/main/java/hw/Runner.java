package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    private static final Logger logger = LogManager.getLogger(Runner.class);
    public static void main(String[] args) {
        logger.info("Rock-Paper-Scissors game begins...");
        Scanner scanner = new Scanner(System.in);


        try {
            logger.info("Rock-Paper-Scissors Game");
            logger.info("---------------------------");

            logger.info("Enter Player 1 name: ");

            String player1Name = scanner.nextLine();

            logger.info("Enter Player 2 name: ");
            String player2Name = scanner.nextLine();

            int rounds = readRounds(scanner);

            RockPaperScissorsGame game = new RockPaperScissorsGame(player1Name, player2Name);
            game.startGame(rounds);

        } catch (InputMismatchException e) {
            logger.error("Input error. Please enter an integer.");

        } finally {
            scanner.close();
            logger.info("The game is over.");
        }
    }

    private static int readRounds(Scanner scanner) {
        int rounds = 0;
        boolean validInput = false;

        while (!validInput) {
            logger.info("Enter the number of rounds: ");

            try {
                rounds = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                logger.error("Input error. Please enter an integer.");
            } finally {
                scanner.nextLine();
            }
        }

        return rounds;
    }


}
