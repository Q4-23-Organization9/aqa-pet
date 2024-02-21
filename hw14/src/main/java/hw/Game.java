package hw;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Game {

    private static final Logger logger = LogManager.getLogger(Game.class);
    protected Player player1;
    protected Player player2;
    protected int player1Score;
    protected int player2Score;

    public Game(String name1, String name2) {
        logger.info("Creating game with players: {} and {}", name1, name2);
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public abstract void playRound();

    public void startGame(int rounds) {
        logger.info("Starting game with {} rounds", rounds);
        if (rounds <= 0) {
            throw new IllegalArgumentException("The number of rounds must be a positive integer.");
        }

        for (int i = 1; i <= rounds; i++) {
            logger.info("Round " + i + " : ");
            playRound();
        }

        displayFinalResults();
    }

    protected void displayFinalResults() {
        logger.info("Displaying final results");
        logger.info("\nFinal score:");
        logger.info(player1.getName() + ": " + player1Score);
        logger.info(player2.getName() + ": " + player2Score);

        if (player1Score > player2Score) {
            logger.info(player1.getName() + " winner!");
        } else if (player1Score < player2Score) {
            logger.info(player2.getName() + " winner!");
        } else {
            logger.info("Draw!");
        }
    }


    protected void determineWinner() {
        logger.info("Determining the winner for the current round");
        Select select1 = player1.getSelect();
        Select select2 = player2.getSelect();

        logger.info(player1.getName() + " chose: " + select1);
        logger.info(player2.getName() + " chose: " + select2);

        if (select1 == select2) {
            logger.info("Draw in this round!");
        } else if ((select1 == Select.ROCK && select2 == Select.SCISSORS) ||
                (select1 == Select.SCISSORS && select2 == Select.PAPER) ||
                (select1 == Select.PAPER && select2 == Select.ROCK)) {
            logger.info(player1.getName() + " wins this round!");
            player1Score++;
        } else {
            logger.info(player2.getName() + " wins this round!");
            player2Score++;
        }
    }


}
