package hw;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class RockPaperScissorsGame extends Game {
    private static final Logger logger = LogManager.getLogger(RockPaperScissorsGame.class);
    public RockPaperScissorsGame(String name1, String name2) {
        super(name1, name2);
    }

    @Override
    public void playRound() {
        logger.info("Playing a round of Rock-Paper-Scissors game");
        player1.makeSelect();
        player2.makeSelect();
        determineWinner();
    }


}
