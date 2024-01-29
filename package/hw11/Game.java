package hw11;

public abstract class Game {

    protected Player player1;
    protected Player player2;
    protected int player1Score;
    protected int player2Score;

    public Game(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public abstract void playRound();

    public void startGame(int rounds) {
        if (rounds <= 0) {
            throw new IllegalArgumentException("The number of rounds must be a positive integer.");
        }

        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round  " + i + " : ");
            playRound();
        }

        displayFinalResults();
    }

    protected void displayFinalResults() {
        System.out.println("\nFinal score:");
        System.out.println(player1.getName() + ": " + player1Score);
        System.out.println(player2.getName() + ": " + player2Score);

        if (player1Score > player2Score) {
            System.out.println(player1.getName() + " winner!");
        } else if (player1Score < player2Score) {
            System.out.println(player2.getName() + " winner!");
        } else {
            System.out.println("Draw!");
        }
    }


    protected void determineWinner() {
        Select select1 = player1.getSelect();
        Select select2 = player2.getSelect();

        System.out.println(player1.getName() + " chose: " + select1);
        System.out.println(player2.getName() + " chose: " + select2);

        if (select1 == select2) {
            System.out.println("Draw in this round!");
        } else if ((select1 == Select.ROCK && select2 == Select.SCISSORS) ||
                (select1 == Select.SCISSORS && select2 == Select.PAPER) ||
                (select1 == Select.PAPER && select2 == Select.ROCK)) {
            System.out.println(player1.getName() + " wins this round!");
            player1Score++;
        } else {
            System.out.println(player2.getName() + " wins this round!");
            player2Score++;
        }
    }

}
