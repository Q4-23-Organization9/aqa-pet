package hw11;

public class RockPaperScissorsGame extends Game{

    public RockPaperScissorsGame(String name1, String name2) {
        super(name1, name2);
    }

    @Override
    public void playRound() {
        player1.makeSelect();
        player2.makeSelect();
        determineWinner();
    }

}
