package hw;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Player {

    private static final Logger logger = LogManager.getLogger(Player.class);

    private String name;
    private Select select;

    public Player(String name) {
        this.name = name;
    }

    public void makeSelect() {
        logger.info("{} makes a choice (ROCK, SCISSORS, PAPER): ", name);

        logger.info(name + ", enter your choice (ROCK, SCISSORS, PAPER): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        try {
            select = Select.valueOf(input);
        } catch (IllegalArgumentException e) {
            logger.error("Invalid choice: {}. Please try again.", input, e);
            makeSelect();
        }

    }

    public Select getSelect() {
        return select;
    }

    public String getName() {
        return name;
    }


}
